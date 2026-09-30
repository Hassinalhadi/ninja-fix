package zendesk.support.request;

import com.zendesk.logger.Logger;
import com.zendesk.util.CollectionUtils;
import com.zendesk.util.StringUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import zendesk.support.BuildConfig;
import zendesk.support.SupportUiStorage;
import zendesk.support.request.AsyncMiddleware;
import zendesk.support.request.ComponentPersistence;
import zendesk.support.suas.Action;
import zendesk.support.suas.Dispatcher;
import zendesk.support.suas.GetState;

/* loaded from: classes.dex */
class ActionLoadCachedComments implements AsyncMiddleware.AsyncAction {
    private final ActionFactory actionFactory;
    private final Executor executorService;
    private final MediaResultUtility mediaResultUtility;
    private final String sdkVersion;
    private final SupportUiStorage supportUiStorage;

    /* loaded from: classes.dex */
    public static class LoadComments implements Runnable {

        /* renamed from: af, reason: collision with root package name */
        private final ActionFactory f14265af;
        private final AsyncMiddleware.Callback callback;
        private final Dispatcher dispatcher;

        /* renamed from: id, reason: collision with root package name */
        private final String f14266id;
        private final MediaResultUtility mediaResultUtility;
        private final String sdkVersion;
        private final SupportUiStorage supportUiStorage;

        public LoadComments(String str, Dispatcher dispatcher, AsyncMiddleware.Callback callback, SupportUiStorage supportUiStorage, ActionFactory actionFactory, String str2, MediaResultUtility mediaResultUtility) {
            this.f14266id = str;
            this.dispatcher = dispatcher;
            this.callback = callback;
            this.supportUiStorage = supportUiStorage;
            this.f14265af = actionFactory;
            this.mediaResultUtility = mediaResultUtility;
            this.sdkVersion = str2;
        }

        private StateMessage findLocalAttachmentForMessage(StateMessage stateMessage, StateIdMapper stateIdMapper, String str) {
            List<StateRequestAttachment> attachments = stateMessage.getAttachments();
            if (CollectionUtils.isNotEmpty(attachments)) {
                ArrayList arrayList = new ArrayList(stateMessage.getAttachments().size());
                for (StateRequestAttachment stateRequestAttachment : attachments) {
                    if (stateIdMapper.hasRemoteId(Long.valueOf(stateRequestAttachment.getId()))) {
                        arrayList.add(updateAttachment(stateRequestAttachment, this.mediaResultUtility.getLocalFile(str, stateIdMapper.getRemoteId(Long.valueOf(stateRequestAttachment.getId())).longValue(), stateRequestAttachment.getName())));
                    } else {
                        arrayList.add(stateRequestAttachment);
                    }
                }
                return stateMessage.withAttachments(arrayList);
            }
            return stateMessage;
        }

        private StateRequestAttachment updateAttachment(StateRequestAttachment stateRequestAttachment, MediaResult mediaResult) {
            File file;
            String str;
            if (stateRequestAttachment.getSize() == mediaResult.getFile().length()) {
                file = mediaResult.getFile();
                str = mediaResult.getUri().toString();
            } else {
                file = null;
                str = null;
            }
            return stateRequestAttachment.newBuilder().setLocalFile(file).setLocalUri(str).build();
        }

        public String getId() {
            return this.f14266id;
        }

        public StateConversation resolveAttachments(StateConversation stateConversation) {
            ArrayList arrayList = new ArrayList(stateConversation.getMessages().size());
            Iterator<StateMessage> it = stateConversation.getMessages().iterator();
            while (it.hasNext()) {
                arrayList.add(findLocalAttachmentForMessage(it.next(), stateConversation.getAttachmentIdMapper(), stateConversation.getLocalId()));
            }
            return stateConversation.newBuilder().setMessages(arrayList).build();
        }

        @Override // java.lang.Runnable
        public void run() {
            Action loadCommentsFromCacheError;
            ComponentPersistence.RequestPersistenceModel requestPersistenceModel = (ComponentPersistence.RequestPersistenceModel) this.supportUiStorage.read(this.f14266id, ComponentPersistence.RequestPersistenceModel.class);
            if (requestPersistenceModel != null && requestPersistenceModel.getConversation() != null) {
                if (this.sdkVersion.equals(requestPersistenceModel.getVersion())) {
                    Logger.d("RequestActivity", "Successfully loaded request from disk", new Object[0]);
                    loadCommentsFromCacheError = this.f14265af.loadCommentsFromCacheSuccess(resolveAttachments(requestPersistenceModel.getConversation()));
                } else {
                    Logger.d("RequestActivity", "Cached version doesn't match with SDK version. Ignoring cached data. [%s, %s]", requestPersistenceModel.getVersion(), BuildConfig.VERSION_NAME);
                    loadCommentsFromCacheError = this.f14265af.loadCommentsFromCacheError();
                }
            } else {
                Logger.d("RequestActivity", "Unable to loaded request from disk", new Object[0]);
                loadCommentsFromCacheError = this.f14265af.loadCommentsFromCacheError();
            }
            this.dispatcher.dispatch(loadCommentsFromCacheError);
            this.callback.done();
        }
    }

    public ActionLoadCachedComments(ActionFactory actionFactory, SupportUiStorage supportUiStorage, Executor executor, String str, MediaResultUtility mediaResultUtility) {
        this.actionFactory = actionFactory;
        this.supportUiStorage = supportUiStorage;
        this.executorService = executor;
        this.sdkVersion = str;
        this.mediaResultUtility = mediaResultUtility;
    }

    @Override // zendesk.support.request.AsyncMiddleware.AsyncAction
    public void actionQueued(Dispatcher dispatcher, GetState getState) {
        dispatcher.dispatch(this.actionFactory.loadCommentsFromCache());
    }

    @Override // zendesk.support.request.AsyncMiddleware.AsyncAction
    public void execute(Dispatcher dispatcher, GetState getState, AsyncMiddleware.Callback callback) {
        StateConversation fromState = StateConversation.fromState(getState.getState());
        if (StringUtils.hasLength(fromState.getLocalId())) {
            this.executorService.execute(new LoadComments(fromState.getLocalId(), dispatcher, callback, this.supportUiStorage, this.actionFactory, this.sdkVersion, this.mediaResultUtility));
        } else {
            dispatcher.dispatch(this.actionFactory.skipAction());
            callback.done();
        }
    }
}

package zendesk.support.request;

import com.zendesk.logger.Logger;
import com.zendesk.util.StringUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import zendesk.support.AttachmentFile;
import zendesk.support.IdUtil;
import zendesk.support.SupportBlipsProvider;
import zendesk.support.SupportUiStorage;
import zendesk.support.request.AsyncMiddleware;
import zendesk.support.request.ComponentPersistence;
import zendesk.support.suas.Dispatcher;
import zendesk.support.suas.GetState;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class ActionInstallConfiguration implements AsyncMiddleware.AsyncAction {

    /* renamed from: af, reason: collision with root package name */
    private final ActionFactory f14264af;
    private final SupportBlipsProvider blipsProvider;
    private final Executor executor;
    private final Executor mainThreadExecutor;
    private final RequestConfiguration startConfig;
    private final SupportUiStorage supportUiStorage;

    public ActionInstallConfiguration(SupportUiStorage supportUiStorage, RequestConfiguration requestConfiguration, Executor executor, Executor executor2, ActionFactory actionFactory, SupportBlipsProvider supportBlipsProvider) {
        this.supportUiStorage = supportUiStorage;
        this.startConfig = requestConfiguration;
        this.executor = executor;
        this.mainThreadExecutor = executor2;
        this.f14264af = actionFactory;
        this.blipsProvider = supportBlipsProvider;
    }

    @Override // zendesk.support.request.AsyncMiddleware.AsyncAction
    public void actionQueued(Dispatcher dispatcher, GetState getState) {
    }

    @Override // zendesk.support.request.AsyncMiddleware.AsyncAction
    public void execute(final Dispatcher dispatcher, GetState getState, final AsyncMiddleware.Callback callback) {
        this.executor.execute(new Runnable() { // from class: zendesk.support.request.ActionInstallConfiguration.1
            @Override // java.lang.Runnable
            public void run() {
                List<AttachmentFile> arrayList;
                boolean hasLength = StringUtils.hasLength(ActionInstallConfiguration.this.startConfig.getRequestId());
                boolean hasLength2 = StringUtils.hasLength(ActionInstallConfiguration.this.startConfig.getLocalRequestId());
                String requestId = ActionInstallConfiguration.this.startConfig.getRequestId();
                String localRequestId = ActionInstallConfiguration.this.startConfig.getLocalRequestId();
                if (!hasLength || !hasLength2) {
                    ComponentPersistence.RequestIdMapper requestIdMapper = (ComponentPersistence.RequestIdMapper) ActionInstallConfiguration.this.supportUiStorage.read(SupportUiStorage.REQUEST_MAPPER, ComponentPersistence.RequestIdMapper.class);
                    if (requestIdMapper != null) {
                        if (hasLength2) {
                            requestId = requestIdMapper.getRemoteId(localRequestId);
                        } else if (hasLength) {
                            localRequestId = requestIdMapper.getLocalId(requestId);
                        }
                    }
                    if (!StringUtils.hasLength(localRequestId)) {
                        localRequestId = IdUtil.newStringId();
                    }
                }
                String str = requestId;
                String str2 = localRequestId;
                if (StringUtils.hasLength(str)) {
                    ActionInstallConfiguration.this.blipsProvider.requestViewed(str);
                }
                Logger.d("RequestActivity", "Request information loaded from disk. Remote id: '%s'. Local id: '%s'", str, str2);
                if (StringUtils.isEmpty(str)) {
                    arrayList = ActionInstallConfiguration.this.startConfig.getFilesAsAttachments();
                } else {
                    arrayList = new ArrayList<>();
                }
                final RequestConfiguration requestConfiguration = new RequestConfiguration(ActionInstallConfiguration.this.startConfig.getRequestSubject(), ActionInstallConfiguration.this.startConfig.getTags(), str, str2, ActionInstallConfiguration.this.startConfig.getRequestStatus(), ActionInstallConfiguration.this.startConfig.getCustomFields(), ActionInstallConfiguration.this.startConfig.getTicketFormId(), arrayList, ActionInstallConfiguration.this.startConfig.hasAgentReplies(), ActionInstallConfiguration.this.startConfig.getConfigurations());
                ActionInstallConfiguration.this.mainThreadExecutor.execute(new Runnable() { // from class: zendesk.support.request.ActionInstallConfiguration.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                        dispatcher.dispatch(ActionInstallConfiguration.this.f14264af.startConfig(requestConfiguration));
                        callback.done();
                    }
                });
            }
        });
    }
}

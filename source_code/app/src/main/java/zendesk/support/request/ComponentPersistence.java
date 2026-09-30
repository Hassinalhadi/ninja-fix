package zendesk.support.request;

import com.zendesk.util.CollectionUtils;
import com.zendesk.util.StringUtils;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import zendesk.support.BuildConfig;
import zendesk.support.SupportUiStorage;
import zendesk.support.suas.Listener;
import zendesk.support.suas.State;
import zendesk.support.suas.StateSelector;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class ComponentPersistence implements Listener<RequestPersistenceModel> {
    private static final String LOG_TAG = "ComponentPersistence";
    private final Executor executor;
    private final AtomicBoolean isMappingComplete = new AtomicBoolean(false);
    private final PersistenceSelector persistenceSelector = new PersistenceSelector();
    private final PersistenceQueue queue;
    private final SupportUiStorage supportUiStorage;

    /* loaded from: classes.dex */
    public interface Item {
        void persist();
    }

    /* loaded from: classes.dex */
    public static class PersistenceItem implements Item {
        private final RequestPersistenceModel model;
        private final SupportUiStorage supportUiStorage;

        public PersistenceItem(SupportUiStorage supportUiStorage, RequestPersistenceModel requestPersistenceModel) {
            this.supportUiStorage = supportUiStorage;
            this.model = requestPersistenceModel;
        }

        @Override // zendesk.support.request.ComponentPersistence.Item
        public void persist() {
            this.supportUiStorage.write(this.model.getLocalRequestId(), this.model);
        }
    }

    /* loaded from: classes.dex */
    public static class PersistenceQueue {
        private final Executor executor;
        private final List<Item> actions = new ArrayList(2);
        private final AtomicBoolean workerRunning = new AtomicBoolean(false);

        /* loaded from: classes.dex */
        public class Worker implements Runnable {
            public /* synthetic */ Worker(PersistenceQueue persistenceQueue, int i4) {
                this();
            }

            @Override // java.lang.Runnable
            public void run() {
                Item item;
                while (true) {
                    synchronized (PersistenceQueue.this.actions) {
                        if (PersistenceQueue.this.actions.size() > 0) {
                            item = (Item) PersistenceQueue.this.actions.get(0);
                        } else {
                            PersistenceQueue.this.workerRunning.set(false);
                            return;
                        }
                    }
                    if (item != null) {
                        try {
                            item.persist();
                        } catch (Exception unused) {
                        } catch (Throwable th) {
                            PersistenceQueue.this.actions.remove(item);
                            throw th;
                        }
                        PersistenceQueue.this.actions.remove(item);
                    }
                }
            }

            private Worker() {
            }
        }

        public PersistenceQueue(Executor executor) {
            this.executor = executor;
        }

        private void startWorker() {
            int i4 = 0;
            if (this.workerRunning.compareAndSet(false, true)) {
                this.executor.execute(new Worker(this, i4));
            }
        }

        public void dispatch(Item item) {
            if (item != null) {
                synchronized (this.actions) {
                    try {
                        if (this.actions.size() >= 2) {
                            this.actions.set(1, item);
                        } else {
                            this.actions.add(item);
                        }
                        startWorker();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static class PersistenceSelector implements StateSelector<RequestPersistenceModel> {
        @Override // zendesk.support.suas.StateSelector
        public RequestPersistenceModel selectData(State state) {
            StateConversation fromState = StateConversation.fromState(state);
            return new RequestPersistenceModel(fromState.getLocalId(), new Date(), BuildConfig.VERSION_NAME, fromState, StateAndroidLifecycle.fromState(state).getState() == 2);
        }
    }

    /* loaded from: classes.dex */
    public static class RequestIdMapper {
        private final Map<String, String> localToRemote = new HashMap();
        private final Map<String, String> remoteToLocal = new HashMap();

        public RequestIdMapper addIdMapping(String str, String str2) {
            this.localToRemote.put(str2, str);
            this.remoteToLocal.put(str, str2);
            return this;
        }

        public RequestIdMapper addLocalId(String str) {
            this.localToRemote.put(str, "");
            return this;
        }

        public String getLocalId(String str) {
            return this.remoteToLocal.get(str);
        }

        public Set<String> getLocalIds() {
            return this.localToRemote.keySet();
        }

        public String getRemoteId(String str) {
            return this.localToRemote.get(str);
        }

        public boolean hasLocalId(String str) {
            if (this.remoteToLocal.containsKey(str) && StringUtils.hasLength(this.remoteToLocal.get(str))) {
                return true;
            }
            return false;
        }

        public boolean hasRemoteId(String str) {
            if (this.localToRemote.containsKey(str) && StringUtils.hasLength(this.localToRemote.get(str))) {
                return true;
            }
            return false;
        }

        public RequestIdMapper removeLocalIdMapping(String str) {
            this.localToRemote.remove(str);
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static class RequestPersistenceModel {
        private final transient boolean activityStopped;
        private final StateConversation conversation;
        private final Date date;
        private final transient String requestId;
        private final String version;

        public RequestPersistenceModel(String str, Date date, String str2, StateConversation stateConversation, boolean z2) {
            this.requestId = str;
            this.date = date;
            this.version = str2;
            this.conversation = stateConversation;
            this.activityStopped = z2;
        }

        public StateConversation getConversation() {
            return this.conversation;
        }

        public Date getDate() {
            return this.date;
        }

        public String getLocalRequestId() {
            return this.requestId;
        }

        public String getVersion() {
            return this.version;
        }

        public boolean isActivityStopped() {
            return this.activityStopped;
        }
    }

    public ComponentPersistence(SupportUiStorage supportUiStorage, PersistenceQueue persistenceQueue, Executor executor) {
        this.supportUiStorage = supportUiStorage;
        this.queue = persistenceQueue;
        this.executor = executor;
    }

    private void persistConversation(RequestPersistenceModel requestPersistenceModel) {
        boolean z2;
        boolean isActivityStopped = requestPersistenceModel.isActivityStopped();
        boolean hasLength = StringUtils.hasLength(requestPersistenceModel.getLocalRequestId());
        if (requestPersistenceModel.getConversation().getMessages().size() > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (isActivityStopped && hasLength && z2) {
            this.queue.dispatch(new PersistenceItem(this.supportUiStorage, requestPersistenceModel));
        }
    }

    private void persistRequestId(final RequestPersistenceModel requestPersistenceModel) {
        boolean z2;
        if (!this.isMappingComplete.get()) {
            final String remoteId = requestPersistenceModel.getConversation().getRemoteId();
            final String localId = requestPersistenceModel.getConversation().getLocalId();
            final boolean z10 = false;
            if (requestPersistenceModel.getConversation().getMessages().size() > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (StringUtils.hasLength(remoteId) && StringUtils.hasLength(localId)) {
                z10 = true;
            }
            if (z10 || z2) {
                if (z10) {
                    this.isMappingComplete.set(true);
                }
                this.executor.execute(new Runnable() { // from class: zendesk.support.request.ComponentPersistence.1
                    @Override // java.lang.Runnable
                    public void run() {
                        RequestIdMapper requestIdMapper = (RequestIdMapper) ComponentPersistence.this.supportUiStorage.read(SupportUiStorage.REQUEST_MAPPER, RequestIdMapper.class);
                        if (requestIdMapper == null) {
                            requestIdMapper = new RequestIdMapper();
                        }
                        if (z10) {
                            if (!requestIdMapper.hasLocalId(remoteId) || !requestIdMapper.hasRemoteId(localId)) {
                                ComponentPersistence.this.supportUiStorage.write(SupportUiStorage.REQUEST_MAPPER, requestIdMapper.addIdMapping(remoteId, localId));
                                return;
                            }
                            return;
                        }
                        if (!requestIdMapper.hasRemoteId(localId)) {
                            ComponentPersistence.this.supportUiStorage.write(SupportUiStorage.REQUEST_MAPPER, requestIdMapper.addLocalId(localId));
                        }
                    }
                });
                return;
            }
            return;
        }
        if (CollectionUtils.isEmpty(requestPersistenceModel.getConversation().getMessages())) {
            this.executor.execute(new Runnable() { // from class: zendesk.support.request.ComponentPersistence.2
                @Override // java.lang.Runnable
                public void run() {
                    RequestIdMapper requestIdMapper = (RequestIdMapper) ComponentPersistence.this.supportUiStorage.read(SupportUiStorage.REQUEST_MAPPER, RequestIdMapper.class);
                    String localRequestId = requestPersistenceModel.getLocalRequestId();
                    if (requestIdMapper != null) {
                        ComponentPersistence.this.supportUiStorage.write(SupportUiStorage.REQUEST_MAPPER, requestIdMapper.removeLocalIdMapping(localRequestId));
                        ComponentPersistence.this.isMappingComplete.set(false);
                    }
                }
            });
        }
    }

    public StateSelector<RequestPersistenceModel> getSelector() {
        return this.persistenceSelector;
    }

    @Override // zendesk.support.suas.Listener
    public void update(RequestPersistenceModel requestPersistenceModel) {
        persistConversation(requestPersistenceModel);
        persistRequestId(requestPersistenceModel);
    }
}

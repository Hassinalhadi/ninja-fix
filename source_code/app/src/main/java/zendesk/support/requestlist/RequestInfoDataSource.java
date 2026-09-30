package zendesk.support.requestlist;

import com.google.gson.reflect.TypeToken;
import com.zendesk.func.ZFunc1;
import com.zendesk.func.ZFunc2;
import com.zendesk.service.ErrorResponse;
import com.zendesk.service.ZendeskCallback;
import com.zendesk.util.CollectionUtils;
import com.zendesk.util.StringUtils;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import zendesk.support.Attachment;
import zendesk.support.Comment;
import zendesk.support.Request;
import zendesk.support.RequestProvider;
import zendesk.support.RequestUpdates;
import zendesk.support.SupportUiStorage;
import zendesk.support.User;
import zendesk.support.requestlist.RequestInfo;

/* loaded from: classes.dex */
public interface RequestInfoDataSource {
    public static final String LOCAL = "local_request_infos";
    public static final String REMOTE = "remote_request_infos";

    /* loaded from: classes.dex */
    public static class Disk implements RequestInfoDataSource {
        private final Executor backgroundThreadExecutor;
        private final String cacheKey;
        private final Executor mainThreadExecutor;
        private final SupportUiStorage supportUiStorage;

        public Disk(Executor executor, Executor executor2, SupportUiStorage supportUiStorage, String str) {
            this.mainThreadExecutor = executor;
            this.backgroundThreadExecutor = executor2;
            this.supportUiStorage = supportUiStorage;
            this.cacheKey = str;
        }

        @Override // zendesk.support.requestlist.RequestInfoDataSource
        public void load(final ZendeskCallback<List<RequestInfo>> zendeskCallback) {
            this.backgroundThreadExecutor.execute(new Runnable() { // from class: zendesk.support.requestlist.RequestInfoDataSource.Disk.1
                @Override // java.lang.Runnable
                public void run() {
                    final List list = (List) Disk.this.supportUiStorage.read(Disk.this.cacheKey, new TypeToken<List<RequestInfo>>() { // from class: zendesk.support.requestlist.RequestInfoDataSource.Disk.1.1
                    }.getType());
                    Disk.this.mainThreadExecutor.execute(new Runnable() { // from class: zendesk.support.requestlist.RequestInfoDataSource.Disk.1.2
                        @Override // java.lang.Runnable
                        public void run() {
                            zendeskCallback.onSuccess(CollectionUtils.ensureEmpty(list));
                        }
                    });
                }
            });
        }

        public void save(final List<RequestInfo> list, final ZendeskCallback<List<RequestInfo>> zendeskCallback) {
            this.backgroundThreadExecutor.execute(new Runnable() { // from class: zendesk.support.requestlist.RequestInfoDataSource.Disk.2
                @Override // java.lang.Runnable
                public void run() {
                    Disk.this.supportUiStorage.write(Disk.this.cacheKey, list);
                    if (zendeskCallback != null) {
                        Disk.this.mainThreadExecutor.execute(new Runnable() { // from class: zendesk.support.requestlist.RequestInfoDataSource.Disk.2.1
                            @Override // java.lang.Runnable
                            public void run() {
                                AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                zendeskCallback.onSuccess(list);
                            }
                        });
                    }
                }
            });
        }
    }

    /* loaded from: classes.dex */
    public static class LocalDataSource implements RequestInfoDataSource {
        private static final Comparator<RequestInfo> REQUEST_INFO_COMPARATOR = new RequestInfo.LastUpdatedComparator();
        private final Disk disk;

        public LocalDataSource(Disk disk) {
            this.disk = disk;
        }

        public void insert(final RequestInfo requestInfo, final ZendeskCallback<List<RequestInfo>> zendeskCallback) {
            this.disk.load(new ZendeskCallback<List<RequestInfo>>() { // from class: zendesk.support.requestlist.RequestInfoDataSource.LocalDataSource.1
                @Override // com.zendesk.service.ZendeskCallback
                public void onError(ErrorResponse errorResponse) {
                    ZendeskCallback zendeskCallback2 = zendeskCallback;
                    if (zendeskCallback2 != null) {
                        zendeskCallback2.onError(errorResponse);
                    }
                }

                @Override // com.zendesk.service.ZendeskCallback
                public void onSuccess(List<RequestInfo> list) {
                    List<RequestInfo> appendOrReplace = CollectionUtils.appendOrReplace(list, requestInfo, new ZFunc2<RequestInfo, RequestInfo, Boolean>() { // from class: zendesk.support.requestlist.RequestInfoDataSource.LocalDataSource.1.1
                        @Override // com.zendesk.func.ZFunc2
                        public Boolean apply(RequestInfo requestInfo2, RequestInfo requestInfo3) {
                            return Boolean.valueOf(requestInfo3.getLocalId().equals(requestInfo2.getLocalId()) || (StringUtils.hasLength(requestInfo3.getRemoteId()) && requestInfo3.getRemoteId().equals(requestInfo2.getRemoteId())));
                        }
                    });
                    Collections.sort(appendOrReplace, LocalDataSource.REQUEST_INFO_COMPARATOR);
                    LocalDataSource.this.disk.save(appendOrReplace, zendeskCallback);
                }
            });
        }

        @Override // zendesk.support.requestlist.RequestInfoDataSource
        public void load(ZendeskCallback<List<RequestInfo>> zendeskCallback) {
            this.disk.load(zendeskCallback);
        }

        public void remove(final String str, final ZendeskCallback<List<RequestInfo>> zendeskCallback) {
            this.disk.load(new ZendeskCallback<List<RequestInfo>>() { // from class: zendesk.support.requestlist.RequestInfoDataSource.LocalDataSource.2
                @Override // com.zendesk.service.ZendeskCallback
                public void onError(ErrorResponse errorResponse) {
                    ZendeskCallback zendeskCallback2 = zendeskCallback;
                    if (zendeskCallback2 != null) {
                        zendeskCallback2.onError(errorResponse);
                    }
                }

                @Override // com.zendesk.service.ZendeskCallback
                public void onSuccess(List<RequestInfo> list) {
                    LocalDataSource.this.disk.save(CollectionUtils.filter(list, new ZFunc1<RequestInfo, Boolean>() { // from class: zendesk.support.requestlist.RequestInfoDataSource.LocalDataSource.2.1
                        @Override // com.zendesk.func.ZFunc1
                        public Boolean apply(RequestInfo requestInfo) {
                            return Boolean.valueOf(!str.equals(requestInfo.getLocalId()));
                        }
                    }), zendeskCallback);
                }
            });
        }
    }

    /* loaded from: classes.dex */
    public static class Network implements RequestInfoDataSource {
        private final RequestProvider requestProvider;

        /* renamed from: zendesk.support.requestlist.RequestInfoDataSource$Network$1, reason: invalid class name */
        /* loaded from: classes.dex */
        public class AnonymousClass1 extends ZendeskCallback<List<Request>> {
            final /* synthetic */ ZendeskCallback val$callback;

            public AnonymousClass1(ZendeskCallback zendeskCallback) {
                this.val$callback = zendeskCallback;
            }

            @Override // com.zendesk.service.ZendeskCallback
            public void onError(ErrorResponse errorResponse) {
                this.val$callback.onError(errorResponse);
            }

            @Override // com.zendesk.service.ZendeskCallback
            public void onSuccess(final List<Request> list) {
                Network.this.requestProvider.getUpdatesForDevice(new ZendeskCallback<RequestUpdates>() { // from class: zendesk.support.requestlist.RequestInfoDataSource.Network.1.1
                    @Override // com.zendesk.service.ZendeskCallback
                    public void onError(ErrorResponse errorResponse) {
                        AnonymousClass1.this.val$callback.onError(errorResponse);
                    }

                    @Override // com.zendesk.service.ZendeskCallback
                    public void onSuccess(final RequestUpdates requestUpdates) {
                        AnonymousClass1.this.val$callback.onSuccess(CollectionUtils.map(list, new ZFunc1<Request, RequestInfo>() { // from class: zendesk.support.requestlist.RequestInfoDataSource.Network.1.1.1
                            @Override // com.zendesk.func.ZFunc1
                            public RequestInfo apply(Request request) {
                                return Network.this.map(request, requestUpdates.isRequestUnread(request.getId()));
                            }
                        }));
                    }
                });
            }
        }

        public Network(RequestProvider requestProvider) {
            this.requestProvider = requestProvider;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public RequestInfo map(Request request, boolean z2) {
            Comment firstComment = request.getFirstComment();
            Comment lastComment = request.getLastComment();
            return new RequestInfo("", request.getId(), request.getStatus(), z2, request.getPublicUpdatedAt(), CollectionUtils.map(CollectionUtils.filter(request.getLastCommentingAgents(), new ZFunc1<User, Boolean>() { // from class: zendesk.support.requestlist.RequestInfoDataSource.Network.2
                @Override // com.zendesk.func.ZFunc1
                public Boolean apply(User user) {
                    return Boolean.valueOf(user != null);
                }
            }), new ZFunc1<User, RequestInfo.AgentInfo>() { // from class: zendesk.support.requestlist.RequestInfoDataSource.Network.3
                @Override // com.zendesk.func.ZFunc1
                public RequestInfo.AgentInfo apply(User user) {
                    Attachment photo = user.getPhoto();
                    return new RequestInfo.AgentInfo(String.valueOf(user.getId()), user.getName(), photo != null ? photo.getContentUrl() : "");
                }
            }), new RequestInfo.MessageInfo(String.valueOf(firstComment.getId()), firstComment.getCreatedAt(), firstComment.getBody()), new RequestInfo.MessageInfo(String.valueOf(lastComment.getId()), lastComment.getCreatedAt(), lastComment.getBody()), new HashSet());
        }

        @Override // zendesk.support.requestlist.RequestInfoDataSource
        public void load(ZendeskCallback<List<RequestInfo>> zendeskCallback) {
            this.requestProvider.getAllRequests(new AnonymousClass1(zendeskCallback));
        }
    }

    /* loaded from: classes.dex */
    public static class RemoteDataSource implements RequestInfoDataSource {
        private final Disk disk;
        private final Network network;

        public RemoteDataSource(Network network, Disk disk) {
            this.network = network;
            this.disk = disk;
        }

        @Override // zendesk.support.requestlist.RequestInfoDataSource
        public void load(final ZendeskCallback<List<RequestInfo>> zendeskCallback) {
            this.network.load(new ZendeskCallback<List<RequestInfo>>() { // from class: zendesk.support.requestlist.RequestInfoDataSource.RemoteDataSource.1
                @Override // com.zendesk.service.ZendeskCallback
                public void onError(final ErrorResponse errorResponse) {
                    RemoteDataSource.this.disk.load(new ZendeskCallback<List<RequestInfo>>() { // from class: zendesk.support.requestlist.RequestInfoDataSource.RemoteDataSource.1.1
                        @Override // com.zendesk.service.ZendeskCallback
                        public void onError(ErrorResponse errorResponse2) {
                            zendeskCallback.onError(errorResponse2);
                        }

                        @Override // com.zendesk.service.ZendeskCallback
                        public void onSuccess(List<RequestInfo> list) {
                            zendeskCallback.onSuccess(list);
                            zendeskCallback.onError(errorResponse);
                        }
                    });
                }

                @Override // com.zendesk.service.ZendeskCallback
                public void onSuccess(List<RequestInfo> list) {
                    RemoteDataSource.this.disk.save(list, zendeskCallback);
                }
            });
        }
    }

    /* loaded from: classes.dex */
    public static class Repository implements RequestInfoDataSource {
        private final RequestInfoDataSource localDataSource;
        private final RequestInfoMerger merger;
        private final RequestInfoDataSource remoteDataSource;

        public Repository(RequestInfoDataSource requestInfoDataSource, RequestInfoDataSource requestInfoDataSource2, RequestInfoMerger requestInfoMerger) {
            this.localDataSource = requestInfoDataSource;
            this.remoteDataSource = requestInfoDataSource2;
            this.merger = requestInfoMerger;
        }

        @Override // zendesk.support.requestlist.RequestInfoDataSource
        public void load(final ZendeskCallback<List<RequestInfo>> zendeskCallback) {
            this.localDataSource.load(new ZendeskCallback<List<RequestInfo>>() { // from class: zendesk.support.requestlist.RequestInfoDataSource.Repository.1
                @Override // com.zendesk.service.ZendeskCallback
                public void onError(ErrorResponse errorResponse) {
                }

                @Override // com.zendesk.service.ZendeskCallback
                public void onSuccess(final List<RequestInfo> list) {
                    Repository.this.remoteDataSource.load(new ZendeskCallback<List<RequestInfo>>() { // from class: zendesk.support.requestlist.RequestInfoDataSource.Repository.1.1
                        @Override // com.zendesk.service.ZendeskCallback
                        public void onError(ErrorResponse errorResponse) {
                            zendeskCallback.onError(errorResponse);
                        }

                        @Override // com.zendesk.service.ZendeskCallback
                        public void onSuccess(List<RequestInfo> list2) {
                            AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                            zendeskCallback.onSuccess(Repository.this.merger.merge(list, list2));
                        }
                    });
                }
            });
        }
    }

    void load(ZendeskCallback<List<RequestInfo>> zendeskCallback);
}

package zendesk.support;

import com.zendesk.logger.Logger;
import com.zendesk.service.ErrorResponse;
import com.zendesk.service.ErrorResponseAdapter;
import com.zendesk.service.ZendeskCallback;
import com.zendesk.util.CollectionUtils;
import com.zendesk.util.StringUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import zendesk.core.AnonymousIdentity;
import zendesk.core.AuthenticationProvider;
import zendesk.core.AuthenticationType;
import zendesk.core.Identity;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ZendeskRequestProvider implements RequestProvider {
    private static final String ALL_REQUEST_STATUSES = "new,open,pending,hold,solved,closed";
    private static final String GET_REQUESTS_SIDE_LOAD = "public_updated_at,last_commenting_agents,last_comment,first_comment";
    private static final String LOG_TAG = "ZendeskRequestProvider";
    private static final int MAX_TICKET_FIELDS = 5;
    private final AuthenticationProvider authenticationProvider;
    private final SupportBlipsProvider blipsProvider;
    private final SupportSdkMetadata metadata;
    private final ZendeskRequestService requestService;
    private final RequestSessionCache requestSessionCache;
    private final RequestStorage requestStorage;
    private final SupportSettingsProvider settingsProvider;
    private final ZendeskTracker zendeskTracker;

    public ZendeskRequestProvider(SupportSettingsProvider supportSettingsProvider, ZendeskRequestService zendeskRequestService, AuthenticationProvider authenticationProvider, RequestStorage requestStorage, RequestSessionCache requestSessionCache, ZendeskTracker zendeskTracker, SupportSdkMetadata supportSdkMetadata, SupportBlipsProvider supportBlipsProvider) {
        this.settingsProvider = supportSettingsProvider;
        this.requestService = zendeskRequestService;
        this.authenticationProvider = authenticationProvider;
        this.requestStorage = requestStorage;
        this.requestSessionCache = requestSessionCache;
        this.zendeskTracker = zendeskTracker;
        this.metadata = supportSdkMetadata;
        this.blipsProvider = supportBlipsProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCommentInternal(final String str, EndUserComment endUserComment, final ZendeskCallback<Comment> zendeskCallback) {
        this.requestService.addComment(str, endUserComment, new ZendeskCallbackSuccess<Request>(zendeskCallback) { // from class: zendesk.support.ZendeskRequestProvider.7
            @Override // zendesk.support.ZendeskCallbackSuccess, com.zendesk.service.ZendeskCallback
            public void onSuccess(Request request) {
                ZendeskRequestProvider.this.zendeskTracker.requestUpdated();
                ZendeskRequestProvider.this.blipsProvider.requestUpdated(str);
                if (request.getId() != null && request.getCommentCount() != null) {
                    ZendeskRequestProvider.this.requestStorage.updateRequestData(Collections.singletonList(request));
                } else {
                    Logger.w(ZendeskRequestProvider.LOG_TAG, "The ID and / or comment count was missing. Cannot store comment totalUpdates.", new Object[0]);
                }
                ZendeskCallback zendeskCallback2 = zendeskCallback;
                if (zendeskCallback2 != null) {
                    zendeskCallback2.onSuccess(request.getLastComment());
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addServerTags(CreateRequest createRequest, SupportSdkSettings supportSdkSettings) {
        List<String> combineLists = CollectionUtils.combineLists(createRequest.getTags(), supportSdkSettings.getContactZendeskTags());
        if (CollectionUtils.isNotEmpty(combineLists)) {
            Logger.d(LOG_TAG, "Adding tags to feedback...", new Object[0]);
            createRequest.setTags(combineLists);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void answerCallbackOnConversationsDisabled(ZendeskCallback zendeskCallback) {
        Logger.d(LOG_TAG, "Conversations disabled, this feature is not available on your plan or was disabled.", new Object[0]);
        if (zendeskCallback != null) {
            zendeskCallback.onError(new ErrorResponseAdapter("Access Denied"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean areConversationsEnabled(SupportSdkSettings supportSdkSettings) {
        if (supportSdkSettings == null) {
            return false;
        }
        return supportSdkSettings.isConversationsEnabled();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static RequestUpdates calcRequestUpdates(List<RequestData> list) {
        HashMap hashMap = new HashMap(list.size());
        for (RequestData requestData : list) {
            int unreadComments = requestData.unreadComments();
            if (unreadComments != 0) {
                hashMap.put(requestData.getId(), Integer.valueOf(unreadComments));
            }
        }
        return new RequestUpdates(hashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static List<TicketForm> convertTicketFormResponse(List<RawTicketForm> list, List<RawTicketField> list2) {
        ArrayList arrayList = new ArrayList();
        Map<Long, TicketField> createTicketFieldMap = createTicketFieldMap(list2);
        Iterator<RawTicketForm> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(createTicketFormFromResponse(it.next(), createTicketFieldMap));
        }
        return arrayList;
    }

    private static Map<Long, TicketField> createTicketFieldMap(List<RawTicketField> list) {
        HashMap hashMap = new HashMap(list.size());
        for (RawTicketField rawTicketField : list) {
            hashMap.put(Long.valueOf(rawTicketField.getId()), TicketField.create(rawTicketField));
        }
        return hashMap;
    }

    private static TicketForm createTicketFormFromResponse(RawTicketForm rawTicketForm, Map<Long, TicketField> map) {
        ArrayList arrayList = new ArrayList();
        for (Long l10 : rawTicketForm.getTicketFieldIds()) {
            if (l10 != null && map.get(l10) != null) {
                arrayList.add(map.get(l10));
            }
        }
        return RawTicketForm.create(rawTicketForm, arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getAllRequestsInternal(String str, AuthenticationType authenticationType, final ZendeskCallback<List<Request>> zendeskCallback) {
        if (StringUtils.isEmpty(str)) {
            str = ALL_REQUEST_STATUSES;
        }
        ZendeskCallbackSuccess<List<Request>> zendeskCallbackSuccess = new ZendeskCallbackSuccess<List<Request>>(zendeskCallback) { // from class: zendesk.support.ZendeskRequestProvider.3
            @Override // zendesk.support.ZendeskCallbackSuccess, com.zendesk.service.ZendeskCallback
            public void onSuccess(List<Request> list) {
                ZendeskRequestProvider.this.requestStorage.updateRequestData(list);
                ZendeskCallback zendeskCallback2 = zendeskCallback;
                if (zendeskCallback2 != null) {
                    zendeskCallback2.onSuccess(list);
                }
            }
        };
        if (authenticationType == AuthenticationType.ANONYMOUS) {
            List<RequestData> requestData = this.requestStorage.getRequestData();
            ArrayList arrayList = new ArrayList(requestData.size());
            Iterator<RequestData> it = requestData.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getId());
            }
            if (CollectionUtils.isEmpty(arrayList)) {
                Logger.w(LOG_TAG, "getAllRequestsInternal: There are no requests to fetch", new Object[0]);
                if (zendeskCallback != null) {
                    zendeskCallback.onSuccess(new ArrayList());
                    return;
                }
                return;
            }
            this.requestService.getAllRequests(StringUtils.toCsvString(arrayList), str, GET_REQUESTS_SIDE_LOAD, zendeskCallbackSuccess);
            return;
        }
        this.requestService.getAllRequests(str, GET_REQUESTS_SIDE_LOAD, zendeskCallbackSuccess);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void internalCreateRequest(CreateRequest createRequest, AuthenticationType authenticationType, Identity identity, final ZendeskCallback<Request> zendeskCallback) {
        ZendeskCallbackSuccess<Request> zendeskCallbackSuccess = new ZendeskCallbackSuccess<Request>(zendeskCallback) { // from class: zendesk.support.ZendeskRequestProvider.2
            @Override // zendesk.support.ZendeskCallbackSuccess, com.zendesk.service.ZendeskCallback
            public void onSuccess(Request request) {
                if (request != null && request.getId() != null) {
                    ZendeskRequestProvider.this.zendeskTracker.requestCreated();
                    ZendeskRequestProvider.this.blipsProvider.requestCreated(request.getId());
                    ZendeskRequestProvider.this.requestStorage.updateRequestData(Collections.singletonList(request));
                    ZendeskCallback zendeskCallback2 = zendeskCallback;
                    if (zendeskCallback2 != null) {
                        zendeskCallback2.onSuccess(request);
                        return;
                    }
                    return;
                }
                onError(new ErrorResponseAdapter("The request was created, but the ID is unknown."));
            }
        };
        if (authenticationType == AuthenticationType.ANONYMOUS && identity != null && (identity instanceof AnonymousIdentity)) {
            this.requestService.createRequest(((AnonymousIdentity) identity).getSdkGuid(), createRequest, zendeskCallbackSuccess);
        } else {
            this.requestService.createRequest(null, createRequest, zendeskCallbackSuccess);
        }
    }

    @Override // zendesk.support.RequestProvider
    public void addComment(final String str, final EndUserComment endUserComment, final ZendeskCallback<Comment> zendeskCallback) {
        this.settingsProvider.getSettings(new ZendeskCallbackSuccess<SupportSdkSettings>(zendeskCallback) { // from class: zendesk.support.ZendeskRequestProvider.8
            @Override // zendesk.support.ZendeskCallbackSuccess, com.zendesk.service.ZendeskCallback
            public void onSuccess(SupportSdkSettings supportSdkSettings) {
                if (ZendeskRequestProvider.areConversationsEnabled(supportSdkSettings)) {
                    ZendeskRequestProvider.this.addCommentInternal(str, endUserComment, zendeskCallback);
                } else {
                    ZendeskRequestProvider.answerCallbackOnConversationsDisabled(zendeskCallback);
                }
            }
        });
    }

    @Override // zendesk.support.RequestProvider
    public void createRequest(final CreateRequest createRequest, final ZendeskCallback<Request> zendeskCallback) {
        if (createRequest == null) {
            Logger.e(LOG_TAG, "configuration is invalid: request null", new Object[0]);
            if (zendeskCallback != null) {
                zendeskCallback.onError(new ErrorResponseAdapter("configuration is invalid: request null"));
                return;
            }
            return;
        }
        this.settingsProvider.getSettings(new ZendeskCallbackSuccess<SupportSdkSettings>(zendeskCallback) { // from class: zendesk.support.ZendeskRequestProvider.1
            @Override // zendesk.support.ZendeskCallbackSuccess, com.zendesk.service.ZendeskCallback
            public void onSuccess(SupportSdkSettings supportSdkSettings) {
                createRequest.setMetadata(ZendeskRequestProvider.this.metadata.getDeviceInfoAsMapForMetaData());
                ZendeskRequestProvider.this.addServerTags(createRequest, supportSdkSettings);
                ZendeskRequestProvider.this.internalCreateRequest(createRequest, supportSdkSettings.getAuthenticationType(), ZendeskRequestProvider.this.authenticationProvider.getIdentity(), zendeskCallback);
            }
        });
    }

    @Override // zendesk.support.RequestProvider
    public void getAllRequests(ZendeskCallback<List<Request>> zendeskCallback) {
        getRequests(null, zendeskCallback);
    }

    @Override // zendesk.support.RequestProvider
    public void getComments(final String str, final ZendeskCallback<CommentsResponse> zendeskCallback) {
        this.settingsProvider.getSettings(new ZendeskCallbackSuccess<SupportSdkSettings>(zendeskCallback) { // from class: zendesk.support.ZendeskRequestProvider.5
            @Override // zendesk.support.ZendeskCallbackSuccess, com.zendesk.service.ZendeskCallback
            public void onSuccess(SupportSdkSettings supportSdkSettings) {
                if (ZendeskRequestProvider.areConversationsEnabled(supportSdkSettings)) {
                    ZendeskRequestProvider.this.requestService.getComments(str, zendeskCallback);
                } else {
                    ZendeskRequestProvider.answerCallbackOnConversationsDisabled(zendeskCallback);
                }
            }
        });
    }

    @Override // zendesk.support.RequestProvider
    public void getCommentsSince(final String str, final Date date, final boolean z2, final ZendeskCallback<CommentsResponse> zendeskCallback) {
        this.settingsProvider.getSettings(new ZendeskCallbackSuccess<SupportSdkSettings>(zendeskCallback) { // from class: zendesk.support.ZendeskRequestProvider.6
            @Override // zendesk.support.ZendeskCallbackSuccess, com.zendesk.service.ZendeskCallback
            public void onSuccess(SupportSdkSettings supportSdkSettings) {
                if (ZendeskRequestProvider.areConversationsEnabled(supportSdkSettings)) {
                    ZendeskRequestProvider.this.requestService.getCommentsSince(str, date, z2, zendeskCallback);
                } else {
                    ZendeskRequestProvider.answerCallbackOnConversationsDisabled(zendeskCallback);
                }
            }
        });
    }

    @Override // zendesk.support.RequestProvider
    public void getRequest(final String str, final ZendeskCallback<Request> zendeskCallback) {
        this.settingsProvider.getSettings(new ZendeskCallbackSuccess<SupportSdkSettings>(zendeskCallback) { // from class: zendesk.support.ZendeskRequestProvider.9
            @Override // zendesk.support.ZendeskCallbackSuccess, com.zendesk.service.ZendeskCallback
            public void onSuccess(SupportSdkSettings supportSdkSettings) {
                if (ZendeskRequestProvider.areConversationsEnabled(supportSdkSettings)) {
                    ZendeskRequestProvider.this.requestService.getRequest(str, ZendeskRequestProvider.GET_REQUESTS_SIDE_LOAD, zendeskCallback);
                } else {
                    ZendeskRequestProvider.answerCallbackOnConversationsDisabled(zendeskCallback);
                }
            }
        });
    }

    @Override // zendesk.support.RequestProvider
    public void getRequests(final String str, final ZendeskCallback<List<Request>> zendeskCallback) {
        this.settingsProvider.getSettings(new ZendeskCallbackSuccess<SupportSdkSettings>(zendeskCallback) { // from class: zendesk.support.ZendeskRequestProvider.4
            @Override // zendesk.support.ZendeskCallbackSuccess, com.zendesk.service.ZendeskCallback
            public void onSuccess(SupportSdkSettings supportSdkSettings) {
                if (ZendeskRequestProvider.areConversationsEnabled(supportSdkSettings)) {
                    ZendeskRequestProvider.this.getAllRequestsInternal(str, supportSdkSettings.getAuthenticationType(), zendeskCallback);
                } else {
                    ZendeskRequestProvider.answerCallbackOnConversationsDisabled(zendeskCallback);
                }
            }
        });
    }

    @Override // zendesk.support.RequestProvider
    public void getTicketFormsById(List<Long> list, final ZendeskCallback<List<TicketForm>> zendeskCallback) {
        if (CollectionUtils.isEmpty(list)) {
            if (zendeskCallback != null) {
                zendeskCallback.onError(new ErrorResponseAdapter("Ticket forms must at least contain 1 Id"));
                return;
            }
            return;
        }
        final ArrayList arrayList = new ArrayList();
        if (list.size() > 5) {
            arrayList.addAll(list.subList(0, 5));
            Logger.d(LOG_TAG, "Maximum number of allowed ticket fields: %d.", 5);
        } else {
            arrayList.addAll(list);
        }
        if (this.requestSessionCache.containsAllTicketForms(arrayList)) {
            if (zendeskCallback != null) {
                zendeskCallback.onSuccess(this.requestSessionCache.getTicketFormsById(arrayList));
                return;
            }
            return;
        }
        this.settingsProvider.getSettings(new ZendeskCallbackSuccess<SupportSdkSettings>(zendeskCallback) { // from class: zendesk.support.ZendeskRequestProvider.10
            @Override // zendesk.support.ZendeskCallbackSuccess, com.zendesk.service.ZendeskCallback
            public void onSuccess(SupportSdkSettings supportSdkSettings) {
                if (supportSdkSettings.isTicketFormSupportAvailable()) {
                    ZendeskRequestProvider.this.requestService.getTicketFormsById(StringUtils.toCsvStringNumber((List<? extends Number>) arrayList), new ZendeskCallbackSuccess<RawTicketFormResponse>(zendeskCallback) { // from class: zendesk.support.ZendeskRequestProvider.10.1
                        @Override // zendesk.support.ZendeskCallbackSuccess, com.zendesk.service.ZendeskCallback
                        public void onSuccess(RawTicketFormResponse rawTicketFormResponse) {
                            List<TicketForm> convertTicketFormResponse = ZendeskRequestProvider.convertTicketFormResponse(rawTicketFormResponse.getTicketForms(), rawTicketFormResponse.getTicketFields());
                            ZendeskRequestProvider.this.requestSessionCache.updateTicketFormCache(convertTicketFormResponse);
                            ZendeskCallback zendeskCallback2 = zendeskCallback;
                            if (zendeskCallback2 != null) {
                                zendeskCallback2.onSuccess(convertTicketFormResponse);
                            }
                        }
                    });
                } else {
                    ZendeskCallback zendeskCallback2 = zendeskCallback;
                    if (zendeskCallback2 != null) {
                        zendeskCallback2.onError(new ErrorResponseAdapter("Ticket form support disabled."));
                    }
                }
            }
        });
    }

    @Override // zendesk.support.RequestProvider
    public void getUpdatesForDevice(final ZendeskCallback<RequestUpdates> zendeskCallback) {
        if (!this.requestStorage.isRequestDataExpired()) {
            zendeskCallback.onSuccess(calcRequestUpdates(this.requestStorage.getRequestData()));
        } else {
            this.settingsProvider.getSettings(new ZendeskCallback<SupportSdkSettings>() { // from class: zendesk.support.ZendeskRequestProvider.11
                @Override // com.zendesk.service.ZendeskCallback
                public void onError(ErrorResponse errorResponse) {
                    zendeskCallback.onError(errorResponse);
                }

                @Override // com.zendesk.service.ZendeskCallback
                public void onSuccess(SupportSdkSettings supportSdkSettings) {
                    if (!supportSdkSettings.isConversationsEnabled()) {
                        ZendeskRequestProvider.answerCallbackOnConversationsDisabled(zendeskCallback);
                    } else {
                        ZendeskRequestProvider.this.getAllRequestsInternal(null, supportSdkSettings.getAuthenticationType(), new ZendeskCallbackSuccess<List<Request>>(zendeskCallback) { // from class: zendesk.support.ZendeskRequestProvider.11.1
                            @Override // zendesk.support.ZendeskCallbackSuccess, com.zendesk.service.ZendeskCallback
                            public void onSuccess(List<Request> list) {
                                zendeskCallback.onSuccess(ZendeskRequestProvider.calcRequestUpdates(ZendeskRequestProvider.this.requestStorage.getRequestData()));
                            }
                        });
                    }
                }
            });
        }
    }

    @Override // zendesk.support.RequestProvider
    public void markRequestAsRead(String str, int i4) {
        this.requestStorage.markRequestAsRead(str, i4);
    }

    @Override // zendesk.support.RequestProvider
    public void markRequestAsUnread(String str) {
        this.requestStorage.markRequestAsUnread(str);
    }
}

package zendesk.support;

import com.zendesk.service.RetrofitZendeskCallbackAdapter;
import com.zendesk.service.ZendeskCallback;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class ZendeskRequestService {
    private static final String LOG_TAG = "ZendeskRequestService";
    private static final String ROLE_AGENT = "agent";
    private static final String ROLE_USER = "end_user";
    private static final String TICKET_FIELDS_INCLUDE = "ticket_fields";
    private final DateFormat iso8601;
    private final RetrofitZendeskCallbackAdapter.RequestExtractor<RequestResponse, Request> requestExtractor;
    private final RequestService requestService;
    private final RetrofitZendeskCallbackAdapter.RequestExtractor<RequestsResponse, List<Request>> requestsExtractor;

    public ZendeskRequestService(RequestService requestService) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US);
        this.iso8601 = simpleDateFormat;
        this.requestsExtractor = new RetrofitZendeskCallbackAdapter.RequestExtractor<RequestsResponse, List<Request>>() { // from class: zendesk.support.ZendeskRequestService.3
            @Override // com.zendesk.service.RetrofitZendeskCallbackAdapter.RequestExtractor
            public List<Request> extract(RequestsResponse requestsResponse) {
                Map agentMap = ZendeskRequestService.getAgentMap(requestsResponse.getLastCommentingAgents());
                ArrayList arrayList = new ArrayList();
                Iterator<Request> it = requestsResponse.getRequests().iterator();
                while (it.hasNext()) {
                    arrayList.add(ZendeskRequestService.updateLastCommentingAgents(it.next(), agentMap));
                }
                return arrayList;
            }
        };
        this.requestExtractor = new RetrofitZendeskCallbackAdapter.RequestExtractor<RequestResponse, Request>() { // from class: zendesk.support.ZendeskRequestService.4
            @Override // com.zendesk.service.RetrofitZendeskCallbackAdapter.RequestExtractor
            public Request extract(RequestResponse requestResponse) {
                return ZendeskRequestService.updateLastCommentingAgents(requestResponse.getRequest(), ZendeskRequestService.getAgentMap(requestResponse.getLastCommentingAgents()));
            }
        };
        this.requestService = requestService;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Map<Long, User> getAgentMap(List<User> list) {
        HashMap hashMap = new HashMap(list.size());
        for (User user : list) {
            hashMap.put(user.getId(), new User(user.getId(), user.getName(), user.getPhoto(), true, -1L, null, null));
        }
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Request updateLastCommentingAgents(Request request, Map<Long, User> map) {
        ArrayList arrayList = new ArrayList(request.getLastCommentingAgentsIds().size());
        Iterator<Long> it = request.getLastCommentingAgentsIds().iterator();
        while (it.hasNext()) {
            arrayList.add(map.get(it.next()));
        }
        request.setLastCommentingAgents(arrayList);
        return request;
    }

    public void addComment(String str, EndUserComment endUserComment, ZendeskCallback<Request> zendeskCallback) {
        UpdateRequestWrapper updateRequestWrapper = new UpdateRequestWrapper();
        Request request = new Request();
        request.setComment(endUserComment);
        updateRequestWrapper.setRequest(request);
        this.requestService.addComment(str, updateRequestWrapper).o(new RetrofitZendeskCallbackAdapter(zendeskCallback, new RetrofitZendeskCallbackAdapter.RequestExtractor<RequestResponse, Request>() { // from class: zendesk.support.ZendeskRequestService.2
            @Override // com.zendesk.service.RetrofitZendeskCallbackAdapter.RequestExtractor
            public Request extract(RequestResponse requestResponse) {
                return requestResponse.getRequest();
            }
        }));
    }

    public void createRequest(String str, CreateRequest createRequest, ZendeskCallback<Request> zendeskCallback) {
        this.requestService.createRequest(str, new CreateRequestWrapper(createRequest)).o(new RetrofitZendeskCallbackAdapter(zendeskCallback, new RetrofitZendeskCallbackAdapter.RequestExtractor<RequestResponse, Request>() { // from class: zendesk.support.ZendeskRequestService.1
            @Override // com.zendesk.service.RetrofitZendeskCallbackAdapter.RequestExtractor
            public Request extract(RequestResponse requestResponse) {
                return requestResponse.getRequest();
            }
        }));
    }

    public void getAllRequests(String str, String str2, ZendeskCallback<List<Request>> zendeskCallback) {
        this.requestService.getAllRequests(str, str2).o(new RetrofitZendeskCallbackAdapter(zendeskCallback, this.requestsExtractor));
    }

    public void getComments(String str, ZendeskCallback<CommentsResponse> zendeskCallback) {
        this.requestService.getComments(str).o(new RetrofitZendeskCallbackAdapter(zendeskCallback));
    }

    public void getCommentsSince(String str, Date date, boolean z2, ZendeskCallback<CommentsResponse> zendeskCallback) {
        String str2;
        String format = this.iso8601.format(date);
        if (z2) {
            str2 = ROLE_AGENT;
        } else {
            str2 = null;
        }
        this.requestService.getCommentsSince(str, format, str2).o(new RetrofitZendeskCallbackAdapter(zendeskCallback));
    }

    public void getRequest(String str, String str2, ZendeskCallback<Request> zendeskCallback) {
        this.requestService.getRequest(str, str2).o(new RetrofitZendeskCallbackAdapter(zendeskCallback, this.requestExtractor));
    }

    public void getTicketFormsById(String str, ZendeskCallback<RawTicketFormResponse> zendeskCallback) {
        this.requestService.getTicketFormsById(str, TICKET_FIELDS_INCLUDE).o(new RetrofitZendeskCallbackAdapter(zendeskCallback));
    }

    public void getAllRequests(String str, String str2, String str3, ZendeskCallback<List<Request>> zendeskCallback) {
        this.requestService.getManyRequests(str, str2, str3).o(new RetrofitZendeskCallbackAdapter(zendeskCallback, this.requestsExtractor));
    }
}

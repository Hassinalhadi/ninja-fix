package zendesk.support;

import vg.d;
import yg.a;
import yg.f;
import yg.i;
import yg.o;
import yg.p;
import yg.s;
import yg.t;

/* loaded from: classes.dex */
interface RequestService {
    @p("/api/mobile/requests/{id}.json?include=last_comment")
    d<RequestResponse> addComment(@s("id") String str, @a UpdateRequestWrapper updateRequestWrapper);

    @o("/api/mobile/requests.json?include=last_comment")
    d<RequestResponse> createRequest(@i("Mobile-Sdk-Identity") String str, @a CreateRequestWrapper createRequestWrapper);

    @f("/api/mobile/requests.json?sort_by=updated_at&sort_order=desc")
    d<RequestsResponse> getAllRequests(@t("status") String str, @t("include") String str2);

    @f("/api/mobile/requests/{id}/comments.json?sort_order=desc")
    d<CommentsResponse> getComments(@s("id") String str);

    @f("/api/mobile/requests/{id}/comments.json?sort_order=desc")
    d<CommentsResponse> getCommentsSince(@s("id") String str, @t("since") String str2, @t("role") String str3);

    @f("/api/mobile/requests/show_many.json?sort_order=desc")
    d<RequestsResponse> getManyRequests(@t("tokens") String str, @t("status") String str2, @t("include") String str3);

    @f("/api/mobile/requests/{id}.json")
    d<RequestResponse> getRequest(@s("id") String str, @t("include") String str2);

    @f("/api/v2/ticket_forms/show_many.json?active=true")
    d<RawTicketFormResponse> getTicketFormsById(@t("ids") String str, @t("include") String str2);
}

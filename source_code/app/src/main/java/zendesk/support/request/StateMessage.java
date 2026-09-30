package zendesk.support.request;

import com.zendesk.service.ErrorResponse;
import com.zendesk.util.StringUtils;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;
import r1.C2483b;
import zendesk.support.Attachment;
import zendesk.support.CommentResponse;
import zendesk.support.IdUtil;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class StateMessage implements Serializable {
    private final List<StateRequestAttachment> attachments;
    private final Date date;
    private final String htmlBody;

    /* renamed from: id, reason: collision with root package name */
    private final long f14285id;
    private final String plainBody;
    private final StateMessageStatus state;
    private final long userId;

    public StateMessage(String str, List<StateRequestAttachment> list) {
        this.htmlBody = null;
        this.plainBody = str;
        this.date = new Date();
        this.f14285id = IdUtil.newLongId();
        this.userId = -1L;
        this.state = StateMessageStatus.pending();
        this.attachments = list;
    }

    public static C2483b convert(List<CommentResponse> list, StateIdMapper stateIdMapper, Map<Long, StateRequestAttachment> map) {
        long newLongId;
        ArrayList arrayList = new ArrayList(list.size());
        StateIdMapper stateIdMapper2 = stateIdMapper;
        for (CommentResponse commentResponse : list) {
            Long id2 = commentResponse.getId();
            Long authorId = commentResponse.getAuthorId();
            if (id2 != null && authorId != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Attachment attachment : commentResponse.getAttachments()) {
                    if (map.containsKey(attachment.getId())) {
                        arrayList2.add(map.get(attachment.getId()));
                    }
                }
                if (stateIdMapper2.hasLocalId(id2)) {
                    newLongId = stateIdMapper2.getLocalId(id2).longValue();
                } else {
                    newLongId = IdUtil.newLongId();
                    stateIdMapper2 = stateIdMapper2.addIdMapping(id2, Long.valueOf(newLongId));
                }
                arrayList.add(new StateMessage(commentResponse.getHtmlBody(), commentResponse.getBody(), commentResponse.getCreatedAt(), newLongId, authorId.longValue(), StateMessageStatus.delivered(), arrayList2));
            }
        }
        return new C2483b(arrayList, stateIdMapper2.copy());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            StateMessage stateMessage = (StateMessage) obj;
            if (this.f14285id != stateMessage.f14285id || this.userId != stateMessage.userId) {
                return false;
            }
            String str = this.htmlBody;
            if (str == null ? stateMessage.htmlBody != null : !str.equals(stateMessage.htmlBody)) {
                return false;
            }
            String str2 = this.plainBody;
            if (str2 == null ? stateMessage.plainBody != null : !str2.equals(stateMessage.plainBody)) {
                return false;
            }
            Date date = this.date;
            if (date == null ? stateMessage.date != null : !date.equals(stateMessage.date)) {
                return false;
            }
            StateMessageStatus stateMessageStatus = this.state;
            if (stateMessageStatus == null ? stateMessage.state != null : !stateMessageStatus.equals(stateMessage.state)) {
                return false;
            }
            List<StateRequestAttachment> list = this.attachments;
            List<StateRequestAttachment> list2 = stateMessage.attachments;
            if (list != null) {
                return list.equals(list2);
            }
            if (list2 == null) {
                return true;
            }
        }
        return false;
    }

    public List<StateRequestAttachment> getAttachments() {
        return this.attachments;
    }

    public String getBody() {
        if (StringUtils.hasLength(this.plainBody)) {
            return this.plainBody;
        }
        return UtilsAttachment.getMessageBodyForAttachments(getAttachments());
    }

    public Date getDate() {
        return this.date;
    }

    public String getHtmlBody() {
        return this.htmlBody;
    }

    public long getId() {
        return this.f14285id;
    }

    public String getPlainBody() {
        return this.plainBody;
    }

    public StateMessageStatus getState() {
        return this.state;
    }

    public long getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.htmlBody, this.plainBody, this.date, Long.valueOf(this.f14285id), Long.valueOf(this.userId), this.state, this.attachments});
    }

    public String toString() {
        return "Message{htmlBody='" + this.htmlBody + "', plainBody='" + this.plainBody + "', date=" + this.date + ", id=" + this.f14285id + ", userId=" + this.userId + ", state=" + this.state + '}';
    }

    public StateMessage withAttachments(List<StateRequestAttachment> list) {
        return new StateMessage(this.htmlBody, this.plainBody, this.date, this.f14285id, this.userId, this.state, list);
    }

    public StateMessage withDelivered() {
        return new StateMessage(this.htmlBody, this.plainBody, this.date, this.f14285id, this.userId, StateMessageStatus.delivered(), this.attachments);
    }

    public StateMessage withError(ErrorResponse errorResponse) {
        return new StateMessage(this.htmlBody, this.plainBody, this.date, this.f14285id, this.userId, StateMessageStatus.error(errorResponse.getReason()), this.attachments);
    }

    public StateMessage withPending() {
        return new StateMessage(this.htmlBody, this.plainBody, this.date, this.f14285id, this.userId, StateMessageStatus.pending(), this.attachments);
    }

    public StateMessage withUpdatedAttachment(StateRequestAttachment stateRequestAttachment) {
        ArrayList arrayList = new ArrayList(this.attachments.size());
        for (StateRequestAttachment stateRequestAttachment2 : this.attachments) {
            if (stateRequestAttachment2.getId() == stateRequestAttachment.getId()) {
                stateRequestAttachment2 = stateRequestAttachment;
            }
            arrayList.add(stateRequestAttachment2);
        }
        return new StateMessage(this.htmlBody, this.plainBody, this.date, this.f14285id, this.userId, this.state, arrayList);
    }

    public StateMessage(String str, String str2, Date date, long j5, long j6, StateMessageStatus stateMessageStatus, List<StateRequestAttachment> list) {
        this.htmlBody = str;
        this.plainBody = str2;
        this.date = date;
        this.f14285id = j5;
        this.userId = j6;
        this.state = stateMessageStatus;
        this.attachments = list;
    }
}

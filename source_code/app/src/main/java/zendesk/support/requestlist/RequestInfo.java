package zendesk.support.requestlist;

import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Set;
import zendesk.support.RequestStatus;

/* loaded from: classes.dex */
public class RequestInfo {
    private final List<AgentInfo> agentInfos;
    private final Set<String> failedMessageIds;
    private final MessageInfo firstMessageInfo;
    private final MessageInfo lastMessageInfo;
    private final Date lastUpdated;
    private final String localId;
    private final String remoteId;
    private final RequestStatus requestStatus;
    private final boolean unread;

    /* loaded from: classes.dex */
    public static class AgentInfo {
        private final String avatar;

        /* renamed from: id, reason: collision with root package name */
        private final String f14290id;
        private final String name;

        public AgentInfo(String str, String str2, String str3) {
            this.f14290id = str;
            this.name = str2;
            this.avatar = str3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                AgentInfo agentInfo = (AgentInfo) obj;
                String str = this.f14290id;
                if (str == null ? agentInfo.f14290id != null : !str.equals(agentInfo.f14290id)) {
                    return false;
                }
                String str2 = this.name;
                if (str2 == null ? agentInfo.name != null : !str2.equals(agentInfo.name)) {
                    return false;
                }
                String str3 = this.avatar;
                String str4 = agentInfo.avatar;
                if (str3 != null) {
                    return str3.equals(str4);
                }
                if (str4 == null) {
                    return true;
                }
            }
            return false;
        }

        public String getAvatar() {
            return this.avatar;
        }

        public String getId() {
            return this.f14290id;
        }

        public String getName() {
            return this.name;
        }

        public int hashCode() {
            int i4;
            int i5;
            String str = this.f14290id;
            int i10 = 0;
            if (str != null) {
                i4 = str.hashCode();
            } else {
                i4 = 0;
            }
            int i11 = i4 * 31;
            String str2 = this.name;
            if (str2 != null) {
                i5 = str2.hashCode();
            } else {
                i5 = 0;
            }
            int i12 = (i11 + i5) * 31;
            String str3 = this.avatar;
            if (str3 != null) {
                i10 = str3.hashCode();
            }
            return i12 + i10;
        }
    }

    /* loaded from: classes.dex */
    public static class LastUpdatedComparator implements Comparator<RequestInfo> {
        @Override // java.util.Comparator
        public int compare(RequestInfo requestInfo, RequestInfo requestInfo2) {
            if (requestInfo2 == null) {
                return 1;
            }
            if (requestInfo.getLastUpdated() == null) {
                return requestInfo2.getLastUpdated() == null ? 0 : -1;
            }
            if (requestInfo2.getLastUpdated() == null) {
                return 1;
            }
            return requestInfo2.getLastUpdated().compareTo(requestInfo.getLastUpdated());
        }
    }

    /* loaded from: classes.dex */
    public static class MessageInfo {
        private final String body;
        private final Date date;

        /* renamed from: id, reason: collision with root package name */
        private final String f14291id;

        public MessageInfo(String str, Date date, String str2) {
            this.f14291id = str;
            this.date = date;
            this.body = str2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                MessageInfo messageInfo = (MessageInfo) obj;
                String str = this.f14291id;
                if (str == null ? messageInfo.f14291id != null : !str.equals(messageInfo.f14291id)) {
                    return false;
                }
                Date date = this.date;
                if (date == null ? messageInfo.date != null : !date.equals(messageInfo.date)) {
                    return false;
                }
                String str2 = this.body;
                String str3 = messageInfo.body;
                if (str2 != null) {
                    return str2.equals(str3);
                }
                if (str3 == null) {
                    return true;
                }
            }
            return false;
        }

        public String getBody() {
            return this.body;
        }

        public Date getDate() {
            return this.date;
        }

        public String getId() {
            return this.f14291id;
        }

        public int hashCode() {
            int i4;
            int i5;
            String str = this.f14291id;
            int i10 = 0;
            if (str != null) {
                i4 = str.hashCode();
            } else {
                i4 = 0;
            }
            int i11 = i4 * 31;
            Date date = this.date;
            if (date != null) {
                i5 = date.hashCode();
            } else {
                i5 = 0;
            }
            int i12 = (i11 + i5) * 31;
            String str2 = this.body;
            if (str2 != null) {
                i10 = str2.hashCode();
            }
            return i12 + i10;
        }
    }

    public RequestInfo(String str, String str2, RequestStatus requestStatus, boolean z2, Date date, List<AgentInfo> list, MessageInfo messageInfo, MessageInfo messageInfo2, Set<String> set) {
        this.localId = str;
        this.remoteId = str2;
        this.requestStatus = requestStatus;
        this.unread = z2;
        this.lastUpdated = date;
        this.agentInfos = list;
        this.firstMessageInfo = messageInfo;
        this.lastMessageInfo = messageInfo2;
        this.failedMessageIds = set;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            RequestInfo requestInfo = (RequestInfo) obj;
            if (this.unread != requestInfo.unread) {
                return false;
            }
            String str = this.localId;
            if (str == null ? requestInfo.localId != null : !str.equals(requestInfo.localId)) {
                return false;
            }
            String str2 = this.remoteId;
            if (str2 == null ? requestInfo.remoteId != null : !str2.equals(requestInfo.remoteId)) {
                return false;
            }
            if (this.requestStatus != requestInfo.requestStatus) {
                return false;
            }
            Date date = this.lastUpdated;
            if (date == null ? requestInfo.lastUpdated != null : !date.equals(requestInfo.lastUpdated)) {
                return false;
            }
            List<AgentInfo> list = this.agentInfos;
            if (list == null ? requestInfo.agentInfos != null : !list.equals(requestInfo.agentInfos)) {
                return false;
            }
            MessageInfo messageInfo = this.firstMessageInfo;
            if (messageInfo == null ? requestInfo.firstMessageInfo != null : !messageInfo.equals(requestInfo.firstMessageInfo)) {
                return false;
            }
            MessageInfo messageInfo2 = this.lastMessageInfo;
            if (messageInfo2 == null ? requestInfo.lastMessageInfo != null : !messageInfo2.equals(requestInfo.lastMessageInfo)) {
                return false;
            }
            Set<String> set = this.failedMessageIds;
            if (set != null) {
                return set.equals(requestInfo.failedMessageIds);
            }
            if (requestInfo.failedMessageIds == null) {
                return true;
            }
        }
        return false;
    }

    public List<AgentInfo> getAgentInfos() {
        return this.agentInfos;
    }

    public Set<String> getFailedMessageIds() {
        return this.failedMessageIds;
    }

    public MessageInfo getFirstMessageInfo() {
        return this.firstMessageInfo;
    }

    public MessageInfo getLastMessageInfo() {
        return this.lastMessageInfo;
    }

    public Date getLastUpdated() {
        return this.lastUpdated;
    }

    public String getLocalId() {
        return this.localId;
    }

    public String getRemoteId() {
        return this.remoteId;
    }

    public RequestStatus getRequestStatus() {
        return this.requestStatus;
    }

    public int hashCode() {
        int i4;
        int i5;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        String str = this.localId;
        int i15 = 0;
        if (str != null) {
            i4 = str.hashCode();
        } else {
            i4 = 0;
        }
        int i16 = i4 * 31;
        String str2 = this.remoteId;
        if (str2 != null) {
            i5 = str2.hashCode();
        } else {
            i5 = 0;
        }
        int i17 = (i16 + i5) * 31;
        RequestStatus requestStatus = this.requestStatus;
        if (requestStatus != null) {
            i10 = requestStatus.hashCode();
        } else {
            i10 = 0;
        }
        int i18 = (((i17 + i10) * 31) + (this.unread ? 1 : 0)) * 31;
        Date date = this.lastUpdated;
        if (date != null) {
            i11 = date.hashCode();
        } else {
            i11 = 0;
        }
        int i19 = (i18 + i11) * 31;
        List<AgentInfo> list = this.agentInfos;
        if (list != null) {
            i12 = list.hashCode();
        } else {
            i12 = 0;
        }
        int i20 = (i19 + i12) * 31;
        MessageInfo messageInfo = this.firstMessageInfo;
        if (messageInfo != null) {
            i13 = messageInfo.hashCode();
        } else {
            i13 = 0;
        }
        int i21 = (i20 + i13) * 31;
        MessageInfo messageInfo2 = this.lastMessageInfo;
        if (messageInfo2 != null) {
            i14 = messageInfo2.hashCode();
        } else {
            i14 = 0;
        }
        int i22 = (i21 + i14) * 31;
        Set<String> set = this.failedMessageIds;
        if (set != null) {
            i15 = set.hashCode();
        }
        return i22 + i15;
    }

    public boolean isClosed() {
        return RequestStatus.Closed.equals(this.requestStatus);
    }

    public boolean isUnread() {
        return this.unread;
    }
}

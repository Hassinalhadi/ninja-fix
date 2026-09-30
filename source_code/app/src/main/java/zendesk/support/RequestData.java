package zendesk.support;

import androidx.appcompat.widget.P0;

/* loaded from: classes.dex */
final class RequestData {
    private final int commentCount;

    /* renamed from: id, reason: collision with root package name */
    private final String f14250id;
    private int readCommentCount;

    private RequestData(String str, int i4, int i5) {
        this.commentCount = i4;
        this.f14250id = str;
        this.readCommentCount = i5;
    }

    public static RequestData create(Request request) {
        return new RequestData(request.getId(), request.getCommentCount().intValue(), 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && RequestData.class == obj.getClass()) {
            String str = this.f14250id;
            String str2 = ((RequestData) obj).f14250id;
            if (str != null) {
                return str.equals(str2);
            }
            if (str2 == null) {
                return true;
            }
        }
        return false;
    }

    public int getCommentCount() {
        return this.commentCount;
    }

    public String getId() {
        return this.f14250id;
    }

    public int getReadCommentCount() {
        return this.readCommentCount;
    }

    public int hashCode() {
        String str = this.f14250id;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("RequestData{commentCount=");
        sb2.append(this.commentCount);
        sb2.append("readCommentCount=");
        sb2.append(this.readCommentCount);
        sb2.append(", id='");
        return P0.gold(sb2, this.f14250id, "'}");
    }

    public int unreadComments() {
        return this.commentCount - this.readCommentCount;
    }

    public static RequestData create(String str, int i4, int i5) {
        return new RequestData(str, i4, i5);
    }
}

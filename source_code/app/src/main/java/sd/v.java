package sd;

import com.google.mlkit.common.MlKitException;
import com.zendesk.service.HttpConstants;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http.HttpStatusCodesKt;

/* loaded from: classes2.dex */
public final class v implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public static final v f13708a;
    public static final v red;
    public static final v silver;
    public static final v teal;
    public static final v white;
    public static final v yellow;
    public final int alpha;
    public final String purple;

    static {
        int collectionSizeOrDefault;
        v vVar = new v(100, "Continue");
        v vVar2 = new v(101, "Switching Protocols");
        v vVar3 = new v(102, "Processing");
        v vVar4 = new v(200, "OK");
        v vVar5 = new v(201, "Created");
        v vVar6 = new v(202, "Accepted");
        v vVar7 = new v(203, "Non-Authoritative Information");
        v vVar8 = new v(204, "No Content");
        v vVar9 = new v(205, "Reset Content");
        v vVar10 = new v(206, "Partial Content");
        v vVar11 = new v(MlKitException.CODE_SCANNER_GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD, "Multi-Status");
        v vVar12 = new v(300, "Multiple Choices");
        v vVar13 = new v(301, "Moved Permanently");
        red = vVar13;
        v vVar14 = new v(HttpConstants.HTTP_MOVED_TEMP, "Found");
        silver = vVar14;
        v vVar15 = new v(HttpConstants.HTTP_SEE_OTHER, "See Other");
        teal = vVar15;
        v vVar16 = new v(HttpConstants.HTTP_NOT_MODIFIED, "Not Modified");
        v vVar17 = new v(HttpConstants.HTTP_USE_PROXY, "Use Proxy");
        v vVar18 = new v(306, "Switch Proxy");
        v vVar19 = new v(HttpStatusCodesKt.HTTP_TEMP_REDIRECT, "Temporary Redirect");
        white = vVar19;
        v vVar20 = new v(HttpStatusCodesKt.HTTP_PERM_REDIRECT, "Permanent Redirect");
        yellow = vVar20;
        v vVar21 = new v(HttpConstants.HTTP_BAD_REQUEST, "Bad Request");
        v vVar22 = new v(HttpConstants.HTTP_UNAUTHORIZED, "Unauthorized");
        v vVar23 = new v(HttpConstants.HTTP_PAYMENT_REQUIRED, "Payment Required");
        v vVar24 = new v(HttpConstants.HTTP_FORBIDDEN, "Forbidden");
        v vVar25 = new v(HttpConstants.HTTP_NOT_FOUND, "Not Found");
        f13708a = vVar25;
        List listOf = CollectionsKt.listOf(vVar, vVar2, vVar3, vVar4, vVar5, vVar6, vVar7, vVar8, vVar9, vVar10, vVar11, vVar12, vVar13, vVar14, vVar15, vVar16, vVar17, vVar18, vVar19, vVar20, vVar21, vVar22, vVar23, vVar24, vVar25, new v(HttpConstants.HTTP_BAD_METHOD, "Method Not Allowed"), new v(HttpConstants.HTTP_NOT_ACCEPTABLE, "Not Acceptable"), new v(HttpConstants.HTTP_PROXY_AUTH, "Proxy Authentication Required"), new v(HttpConstants.HTTP_CLIENT_TIMEOUT, "Request Timeout"), new v(HttpConstants.HTTP_CONFLICT, "Conflict"), new v(HttpConstants.HTTP_GONE, "Gone"), new v(HttpConstants.HTTP_LENGTH_REQUIRED, "Length Required"), new v(HttpConstants.HTTP_PRECON_FAILED, "Precondition Failed"), new v(HttpConstants.HTTP_ENTITY_TOO_LARGE, "Payload Too Large"), new v(HttpConstants.HTTP_REQ_TOO_LONG, "Request-URI Too Long"), new v(HttpConstants.HTTP_UNSUPPORTED_TYPE, "Unsupported Media Type"), new v(416, "Requested Range Not Satisfiable"), new v(417, "Expectation Failed"), new v(HttpConstants.HTTP_UNPROCESSABLE_ENTITY, "Unprocessable Entity"), new v(423, "Locked"), new v(424, "Failed Dependency"), new v(425, "Too Early"), new v(426, "Upgrade Required"), new v(429, "Too Many Requests"), new v(431, "Request Header Fields Too Large"), new v(HttpConstants.HTTP_INTERNAL_ERROR, "Internal Server Error"), new v(HttpConstants.HTTP_NOT_IMPLEMENTED, "Not Implemented"), new v(HttpConstants.HTTP_BAD_GATEWAY, "Bad Gateway"), new v(HttpConstants.HTTP_UNAVAILABLE, "Service Unavailable"), new v(HttpConstants.HTTP_GATEWAY_TIMEOUT, "Gateway Timeout"), new v(HttpConstants.HTTP_VERSION, "HTTP Version Not Supported"), new v(506, "Variant Also Negotiates"), new v(507, "Insufficient Storage"));
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(listOf, 10);
        int quebec = kotlin.collections.y.quebec(collectionSizeOrDefault);
        if (quebec < 16) {
            quebec = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(quebec);
        for (Object obj : listOf) {
            linkedHashMap.put(Integer.valueOf(((v) obj).alpha), obj);
        }
    }

    public v(int i4, String description) {
        Intrinsics.echo(description, "description");
        this.alpha = i4;
        this.purple = description;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        v other = (v) obj;
        Intrinsics.echo(other, "other");
        return this.alpha - other.alpha;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof v) && ((v) obj).alpha == this.alpha) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.alpha;
    }

    public final String toString() {
        return this.alpha + ' ' + this.purple;
    }
}

package vg;

import com.checkout.components.card.utils.constants.ExpiryDateConstantsKt;
import com.clevertap.android.sdk.network.api.CtApi;
import java.util.regex.Pattern;
import okhttp3.FormBody;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Request;
import okhttp3.RequestBody;

/* loaded from: classes2.dex */
public final class an {
    public static final char[] lima = {'0', ExpiryDateConstantsKt.EXPIRY_DATE_ZERO_POSITION_CHECK, ExpiryDateConstantsKt.EXPIRY_DATE_VALID_TEEN_MONTH_SUFFIX_CHECK, '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public static final Pattern mike = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");
    public final String alpha;
    public final HttpUrl bravo;
    public String charlie;
    public HttpUrl.Builder delta;
    public final Request.Builder echo = new Request.Builder();
    public final Headers.Builder foxtrot;
    public MediaType golf;
    public final boolean hotel;
    public final MultipartBody.Builder india;
    public final FormBody.Builder juliet;
    public RequestBody kilo;

    public an(String str, HttpUrl httpUrl, String str2, Headers headers, MediaType mediaType, boolean z2, boolean z10, boolean z11) {
        this.alpha = str;
        this.bravo = httpUrl;
        this.charlie = str2;
        this.golf = mediaType;
        this.hotel = z2;
        if (headers != null) {
            this.foxtrot = headers.newBuilder();
        } else {
            this.foxtrot = new Headers.Builder();
        }
        if (z10) {
            this.juliet = new FormBody.Builder();
        } else if (z11) {
            MultipartBody.Builder builder = new MultipartBody.Builder();
            this.india = builder;
            builder.setType(MultipartBody.FORM);
        }
    }

    public final void alpha(String str, String str2, boolean z2) {
        if (CtApi.HEADER_CONTENT_TYPE.equalsIgnoreCase(str)) {
            try {
                this.golf = MediaType.get(str2);
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException(av.q.echo("Malformed content type: ", str2), e);
            }
        } else {
            Headers.Builder builder = this.foxtrot;
            if (z2) {
                builder.addUnsafeNonAscii(str, str2);
            } else {
                builder.add(str, str2);
            }
        }
    }

    public final void bravo(String str, String str2, boolean z2) {
        String str3 = this.charlie;
        if (str3 != null) {
            HttpUrl httpUrl = this.bravo;
            HttpUrl.Builder newBuilder = httpUrl.newBuilder(str3);
            this.delta = newBuilder;
            if (newBuilder != null) {
                this.charlie = null;
            } else {
                throw new IllegalArgumentException("Malformed URL. Base: " + httpUrl + ", Relative: " + this.charlie);
            }
        }
        if (z2) {
            this.delta.addEncodedQueryParameter(str, str2);
        } else {
            this.delta.addQueryParameter(str, str2);
        }
    }
}

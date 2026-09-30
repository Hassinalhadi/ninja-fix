package W2;

import Tf.aj;
import Tf.ak;
import a3.h;
import android.graphics.Bitmap;
import com.clevertap.android.sdk.network.api.CtApi;
import kotlin.LazyKt;
import kotlin.i;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.CacheControl;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.Response;

/* loaded from: classes3.dex */
public final class b {
    public final Object alpha;
    public final Object bravo;
    public final long charlie;
    public final long delta;
    public final boolean echo;
    public final Headers foxtrot;

    public b(ak akVar) {
        i iVar = i.purple;
        final int i4 = 0;
        this.alpha = LazyKt.alpha(iVar, new Function0(this) { // from class: W2.a
            public final /* synthetic */ b purple;

            {
                this.purple = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i4) {
                    case 0:
                        return CacheControl.INSTANCE.parse(this.purple.foxtrot);
                    default:
                        String str = this.purple.foxtrot.get(CtApi.HEADER_CONTENT_TYPE);
                        if (str != null) {
                            return MediaType.INSTANCE.parse(str);
                        }
                        return null;
                }
            }
        });
        final int i5 = 1;
        this.bravo = LazyKt.alpha(iVar, new Function0(this) { // from class: W2.a
            public final /* synthetic */ b purple;

            {
                this.purple = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i5) {
                    case 0:
                        return CacheControl.INSTANCE.parse(this.purple.foxtrot);
                    default:
                        String str = this.purple.foxtrot.get(CtApi.HEADER_CONTENT_TYPE);
                        if (str != null) {
                            return MediaType.INSTANCE.parse(str);
                        }
                        return null;
                }
            }
        });
        this.charlie = Long.parseLong(akVar.fuchsia(Long.MAX_VALUE));
        this.delta = Long.parseLong(akVar.fuchsia(Long.MAX_VALUE));
        this.echo = Integer.parseInt(akVar.fuchsia(Long.MAX_VALUE)) > 0;
        int parseInt = Integer.parseInt(akVar.fuchsia(Long.MAX_VALUE));
        Headers.Builder builder = new Headers.Builder();
        for (int i10 = 0; i10 < parseInt; i10++) {
            String fuchsia = akVar.fuchsia(Long.MAX_VALUE);
            Bitmap.Config[] configArr = h.alpha;
            int emerald = StringsKt.emerald(fuchsia, ':', 0, 6);
            if (emerald != -1) {
                String substring = fuchsia.substring(0, emerald);
                Intrinsics.delta(substring, "substring(...)");
                String obj = StringsKt.b(substring).toString();
                String substring2 = fuchsia.substring(emerald + 1);
                Intrinsics.delta(substring2, "substring(...)");
                builder.addUnsafeNonAscii(obj, substring2);
            } else {
                throw new IllegalArgumentException("Unexpected header: ".concat(fuchsia).toString());
            }
        }
        this.foxtrot = builder.build();
    }

    public final void alpha(aj ajVar) {
        long j5;
        ajVar.y(this.charlie);
        ajVar.black(10);
        ajVar.y(this.delta);
        ajVar.black(10);
        if (this.echo) {
            j5 = 1;
        } else {
            j5 = 0;
        }
        ajVar.y(j5);
        ajVar.black(10);
        Headers headers = this.foxtrot;
        ajVar.y(headers.size());
        ajVar.black(10);
        int size = headers.size();
        for (int i4 = 0; i4 < size; i4++) {
            ajVar.lavender(headers.name(i4));
            ajVar.lavender(": ");
            ajVar.lavender(headers.value(i4));
            ajVar.black(10);
        }
    }

    public b(Response response) {
        i iVar = i.purple;
        final int i4 = 0;
        this.alpha = LazyKt.alpha(iVar, new Function0(this) { // from class: W2.a
            public final /* synthetic */ b purple;

            {
                this.purple = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i4) {
                    case 0:
                        return CacheControl.INSTANCE.parse(this.purple.foxtrot);
                    default:
                        String str = this.purple.foxtrot.get(CtApi.HEADER_CONTENT_TYPE);
                        if (str != null) {
                            return MediaType.INSTANCE.parse(str);
                        }
                        return null;
                }
            }
        });
        final int i5 = 1;
        this.bravo = LazyKt.alpha(iVar, new Function0(this) { // from class: W2.a
            public final /* synthetic */ b purple;

            {
                this.purple = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i5) {
                    case 0:
                        return CacheControl.INSTANCE.parse(this.purple.foxtrot);
                    default:
                        String str = this.purple.foxtrot.get(CtApi.HEADER_CONTENT_TYPE);
                        if (str != null) {
                            return MediaType.INSTANCE.parse(str);
                        }
                        return null;
                }
            }
        });
        this.charlie = response.sentRequestAtMillis();
        this.delta = response.receivedResponseAtMillis();
        this.echo = response.handshake() != null;
        this.foxtrot = response.headers();
    }
}

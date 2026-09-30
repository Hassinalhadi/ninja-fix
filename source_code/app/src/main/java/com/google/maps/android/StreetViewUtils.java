package com.google.maps.android;

import Cf.d;
import Cf.e;
import Nd.c;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.maps.model.LatLng;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import vf.ad;
import vf.ao;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/google/maps/android/StreetViewUtils;", "", "<init>", "()V", "Companion", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class StreetViewUtils {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\fH\u0086@¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/google/maps/android/StreetViewUtils$Companion;", "", "<init>", "()V", "", "responseString", "Lcom/google/maps/android/ResponseStreetView;", "deserializeResponse", "(Ljava/lang/String;)Lcom/google/maps/android/ResponseStreetView;", "Lcom/google/android/gms/maps/model/LatLng;", "latLng", "apiKey", "Lcom/google/maps/android/Source;", "source", "Lcom/google/maps/android/Status;", "fetchStreetViewData", "(Lcom/google/android/gms/maps/model/LatLng;Ljava/lang/String;Lcom/google/maps/android/Source;LNd/c;)Ljava/lang/Object;", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final ResponseStreetView deserializeResponse(String responseString) {
            String optString = new JSONObject(responseString).optString("status");
            Intrinsics.checkNotNull(optString);
            return new ResponseStreetView(Status.valueOf(optString));
        }

        public static /* synthetic */ Object fetchStreetViewData$default(Companion companion, LatLng latLng, String str, Source source, c cVar, int i4, Object obj) {
            if ((i4 & 4) != 0) {
                source = Source.DEFAULT;
            }
            return companion.fetchStreetViewData(latLng, str, source, cVar);
        }

        @Nullable
        public final Object fetchStreetViewData(@NotNull LatLng latLng, @NotNull String str, @NotNull Source source, @NotNull c<? super Status> cVar) {
            StringBuilder sb2 = new StringBuilder("https://maps.googleapis.com/maps/api/streetview/metadata");
            sb2.append("?location=" + latLng.alpha + Constants.SEPARATOR_COMMA + latLng.purple);
            StringBuilder sb3 = new StringBuilder("&key=");
            sb3.append(str);
            sb2.append(sb3.toString());
            sb2.append("&source=" + source.getValue());
            String sb4 = sb2.toString();
            e eVar = ao.alpha;
            return ad.blue(d.purple, new StreetViewUtils$Companion$fetchStreetViewData$2(sb4, null), cVar);
        }

        private Companion() {
        }
    }
}

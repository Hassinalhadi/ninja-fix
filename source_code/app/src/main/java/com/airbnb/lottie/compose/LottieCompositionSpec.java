package com.airbnb.lottie.compose;

import android.net.Uri;
import ao.ad;
import av.q;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/airbnb/lottie/compose/LottieCompositionSpec;", "", "Asset", "ContentProvider", "File", "JsonString", "RawRes", "Url", "Lcom/airbnb/lottie/compose/LottieCompositionSpec$Asset;", "Lcom/airbnb/lottie/compose/LottieCompositionSpec$ContentProvider;", "Lcom/airbnb/lottie/compose/LottieCompositionSpec$File;", "Lcom/airbnb/lottie/compose/LottieCompositionSpec$JsonString;", "Lcom/airbnb/lottie/compose/LottieCompositionSpec$RawRes;", "Lcom/airbnb/lottie/compose/LottieCompositionSpec$Url;", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface LottieCompositionSpec {

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0014"}, d2 = {"Lcom/airbnb/lottie/compose/LottieCompositionSpec$Asset;", "Lcom/airbnb/lottie/compose/LottieCompositionSpec;", "assetName", "", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "getAssetName", "()Ljava/lang/String;", "equals", "", "other", "", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Ljava/lang/String;)I", "toString", "toString-impl", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Asset implements LottieCompositionSpec {

        @NotNull
        private final String assetName;

        private /* synthetic */ Asset(String str) {
            this.assetName = str;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Asset m15boximpl(String str) {
            return new Asset(str);
        }

        @NotNull
        /* renamed from: constructor-impl, reason: not valid java name */
        public static String m16constructorimpl(@NotNull String assetName) {
            Intrinsics.echo(assetName, "assetName");
            return assetName;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m17equalsimpl(String str, Object obj) {
            return (obj instanceof Asset) && Intrinsics.areEqual(str, ((Asset) obj).m21unboximpl());
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m18equalsimpl0(String str, String str2) {
            return Intrinsics.areEqual(str, str2);
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m19hashCodeimpl(String str) {
            return str.hashCode();
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m20toStringimpl(String str) {
            return ad.gray("Asset(assetName=", str, ")");
        }

        public boolean equals(Object obj) {
            return m17equalsimpl(this.assetName, obj);
        }

        @NotNull
        public final String getAssetName() {
            return this.assetName;
        }

        public int hashCode() {
            return m19hashCodeimpl(this.assetName);
        }

        public String toString() {
            return m20toStringimpl(this.assetName);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ String m21unboximpl() {
            return this.assetName;
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0016"}, d2 = {"Lcom/airbnb/lottie/compose/LottieCompositionSpec$ContentProvider;", "Lcom/airbnb/lottie/compose/LottieCompositionSpec;", "uri", "Landroid/net/Uri;", "constructor-impl", "(Landroid/net/Uri;)Landroid/net/Uri;", "getUri", "()Landroid/net/Uri;", "equals", "", "other", "", "equals-impl", "(Landroid/net/Uri;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Landroid/net/Uri;)I", "toString", "", "toString-impl", "(Landroid/net/Uri;)Ljava/lang/String;", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class ContentProvider implements LottieCompositionSpec {

        @NotNull
        private final Uri uri;

        private /* synthetic */ ContentProvider(Uri uri) {
            this.uri = uri;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ ContentProvider m22boximpl(Uri uri) {
            return new ContentProvider(uri);
        }

        @NotNull
        /* renamed from: constructor-impl, reason: not valid java name */
        public static Uri m23constructorimpl(@NotNull Uri uri) {
            Intrinsics.echo(uri, "uri");
            return uri;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m24equalsimpl(Uri uri, Object obj) {
            return (obj instanceof ContentProvider) && Intrinsics.areEqual(uri, ((ContentProvider) obj).m28unboximpl());
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m25equalsimpl0(Uri uri, Uri uri2) {
            return Intrinsics.areEqual(uri, uri2);
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m26hashCodeimpl(Uri uri) {
            return uri.hashCode();
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m27toStringimpl(Uri uri) {
            return "ContentProvider(uri=" + uri + ")";
        }

        public boolean equals(Object obj) {
            return m24equalsimpl(this.uri, obj);
        }

        @NotNull
        public final Uri getUri() {
            return this.uri;
        }

        public int hashCode() {
            return m26hashCodeimpl(this.uri);
        }

        public String toString() {
            return m27toStringimpl(this.uri);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ Uri m28unboximpl() {
            return this.uri;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0014"}, d2 = {"Lcom/airbnb/lottie/compose/LottieCompositionSpec$File;", "Lcom/airbnb/lottie/compose/LottieCompositionSpec;", "fileName", "", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "getFileName", "()Ljava/lang/String;", "equals", "", "other", "", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Ljava/lang/String;)I", "toString", "toString-impl", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class File implements LottieCompositionSpec {

        @NotNull
        private final String fileName;

        private /* synthetic */ File(String str) {
            this.fileName = str;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ File m29boximpl(String str) {
            return new File(str);
        }

        @NotNull
        /* renamed from: constructor-impl, reason: not valid java name */
        public static String m30constructorimpl(@NotNull String fileName) {
            Intrinsics.echo(fileName, "fileName");
            return fileName;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m31equalsimpl(String str, Object obj) {
            return (obj instanceof File) && Intrinsics.areEqual(str, ((File) obj).m35unboximpl());
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m32equalsimpl0(String str, String str2) {
            return Intrinsics.areEqual(str, str2);
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m33hashCodeimpl(String str) {
            return str.hashCode();
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m34toStringimpl(String str) {
            return ad.gray("File(fileName=", str, ")");
        }

        public boolean equals(Object obj) {
            return m31equalsimpl(this.fileName, obj);
        }

        @NotNull
        public final String getFileName() {
            return this.fileName;
        }

        public int hashCode() {
            return m33hashCodeimpl(this.fileName);
        }

        public String toString() {
            return m34toStringimpl(this.fileName);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ String m35unboximpl() {
            return this.fileName;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0014"}, d2 = {"Lcom/airbnb/lottie/compose/LottieCompositionSpec$JsonString;", "Lcom/airbnb/lottie/compose/LottieCompositionSpec;", "jsonString", "", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "getJsonString", "()Ljava/lang/String;", "equals", "", "other", "", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Ljava/lang/String;)I", "toString", "toString-impl", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class JsonString implements LottieCompositionSpec {

        @NotNull
        private final String jsonString;

        private /* synthetic */ JsonString(String str) {
            this.jsonString = str;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ JsonString m36boximpl(String str) {
            return new JsonString(str);
        }

        @NotNull
        /* renamed from: constructor-impl, reason: not valid java name */
        public static String m37constructorimpl(@NotNull String jsonString) {
            Intrinsics.echo(jsonString, "jsonString");
            return jsonString;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m38equalsimpl(String str, Object obj) {
            return (obj instanceof JsonString) && Intrinsics.areEqual(str, ((JsonString) obj).m42unboximpl());
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m39equalsimpl0(String str, String str2) {
            return Intrinsics.areEqual(str, str2);
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m40hashCodeimpl(String str) {
            return str.hashCode();
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m41toStringimpl(String str) {
            return ad.gray("JsonString(jsonString=", str, ")");
        }

        public boolean equals(Object obj) {
            return m38equalsimpl(this.jsonString, obj);
        }

        @NotNull
        public final String getJsonString() {
            return this.jsonString;
        }

        public int hashCode() {
            return m40hashCodeimpl(this.jsonString);
        }

        public String toString() {
            return m41toStringimpl(this.jsonString);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ String m42unboximpl() {
            return this.jsonString;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087@\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0005J\u0010\u0010\u0010\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0014"}, d2 = {"Lcom/airbnb/lottie/compose/LottieCompositionSpec$RawRes;", "Lcom/airbnb/lottie/compose/LottieCompositionSpec;", "resId", "", "constructor-impl", "(I)I", "getResId", "()I", "equals", "", "other", "", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class RawRes implements LottieCompositionSpec {
        private final int resId;

        private /* synthetic */ RawRes(int i4) {
            this.resId = i4;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ RawRes m43boximpl(int i4) {
            return new RawRes(i4);
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static int m44constructorimpl(int i4) {
            return i4;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m45equalsimpl(int i4, Object obj) {
            return (obj instanceof RawRes) && i4 == ((RawRes) obj).m49unboximpl();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m46equalsimpl0(int i4, int i5) {
            return i4 == i5;
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m47hashCodeimpl(int i4) {
            return i4;
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m48toStringimpl(int i4) {
            return q.delta(i4, "RawRes(resId=", ")");
        }

        public boolean equals(Object obj) {
            return m45equalsimpl(this.resId, obj);
        }

        public final int getResId() {
            return this.resId;
        }

        public int hashCode() {
            return m47hashCodeimpl(this.resId);
        }

        public String toString() {
            return m48toStringimpl(this.resId);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m49unboximpl() {
            return this.resId;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0014"}, d2 = {"Lcom/airbnb/lottie/compose/LottieCompositionSpec$Url;", "Lcom/airbnb/lottie/compose/LottieCompositionSpec;", Constants.KEY_URL, "", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "getUrl", "()Ljava/lang/String;", "equals", "", "other", "", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Ljava/lang/String;)I", "toString", "toString-impl", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Url implements LottieCompositionSpec {

        @NotNull
        private final String url;

        private /* synthetic */ Url(String str) {
            this.url = str;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Url m50boximpl(String str) {
            return new Url(str);
        }

        @NotNull
        /* renamed from: constructor-impl, reason: not valid java name */
        public static String m51constructorimpl(@NotNull String url) {
            Intrinsics.echo(url, "url");
            return url;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m52equalsimpl(String str, Object obj) {
            return (obj instanceof Url) && Intrinsics.areEqual(str, ((Url) obj).m56unboximpl());
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m53equalsimpl0(String str, String str2) {
            return Intrinsics.areEqual(str, str2);
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m54hashCodeimpl(String str) {
            return str.hashCode();
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m55toStringimpl(String str) {
            return ad.gray("Url(url=", str, ")");
        }

        public boolean equals(Object obj) {
            return m52equalsimpl(this.url, obj);
        }

        @NotNull
        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            return m54hashCodeimpl(this.url);
        }

        public String toString() {
            return m55toStringimpl(this.url);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ String m56unboximpl() {
            return this.url;
        }
    }
}

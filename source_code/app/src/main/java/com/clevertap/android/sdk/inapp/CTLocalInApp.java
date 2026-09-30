package com.clevertap.android.sdk.inapp;

import Xd.l;
import bz.af;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;
import s6.AbstractC2708l7;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u0000 \u00052\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lcom/clevertap/android/sdk/inapp/CTLocalInApp;", "", "<init>", "()V", "InAppType", "Companion", "Builder", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CTLocalInApp {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String FALLBACK_TO_NOTIFICATION_SETTINGS = "fallbackToNotificationSettings";

    @NotNull
    public static final String IS_LOCAL_INAPP = "isLocalInApp";

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0006\n\u000b\f\r\u000e\u000fB\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/clevertap/android/sdk/inapp/CTLocalInApp$Builder;", "", "<init>", "()V", "jsonObject", "Lorg/json/JSONObject;", "setInAppType", "Lcom/clevertap/android/sdk/inapp/CTLocalInApp$Builder$Builder1;", "inAppType", "Lcom/clevertap/android/sdk/inapp/CTLocalInApp$InAppType;", "Builder1", "Builder2", "Builder3", "Builder4", "Builder5", "Builder6", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Builder {

        @NotNull
        private JSONObject jsonObject = new JSONObject();

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/clevertap/android/sdk/inapp/CTLocalInApp$Builder$Builder1;", "", "jsonObject", "Lorg/json/JSONObject;", "<init>", "(Lorg/json/JSONObject;)V", "setTitleText", "Lcom/clevertap/android/sdk/inapp/CTLocalInApp$Builder$Builder2;", "titleText", "", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class Builder1 {

            @NotNull
            private JSONObject jsonObject;

            public Builder1(@NotNull JSONObject jsonObject) {
                Intrinsics.echo(jsonObject, "jsonObject");
                this.jsonObject = jsonObject;
            }

            @NotNull
            public final Builder2 setTitleText(@NotNull String titleText) {
                Intrinsics.echo(titleText, "titleText");
                JSONObject jSONObject = this.jsonObject;
                jSONObject.put(Constants.KEY_TITLE, new JSONObject().put(Constants.KEY_TEXT, titleText));
                return new Builder2(jSONObject);
            }
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/clevertap/android/sdk/inapp/CTLocalInApp$Builder$Builder2;", "", "jsonObject", "Lorg/json/JSONObject;", "<init>", "(Lorg/json/JSONObject;)V", "setMessageText", "Lcom/clevertap/android/sdk/inapp/CTLocalInApp$Builder$Builder3;", "messageText", "", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class Builder2 {

            @NotNull
            private JSONObject jsonObject;

            public Builder2(@NotNull JSONObject jsonObject) {
                Intrinsics.echo(jsonObject, "jsonObject");
                this.jsonObject = jsonObject;
            }

            @NotNull
            public final Builder3 setMessageText(@NotNull String messageText) {
                Intrinsics.echo(messageText, "messageText");
                JSONObject jSONObject = this.jsonObject;
                jSONObject.put(Constants.KEY_MESSAGE, new JSONObject().put(Constants.KEY_TEXT, messageText));
                return new Builder3(jSONObject);
            }
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/clevertap/android/sdk/inapp/CTLocalInApp$Builder$Builder3;", "", "jsonObject", "Lorg/json/JSONObject;", "<init>", "(Lorg/json/JSONObject;)V", "followDeviceOrientation", "Lcom/clevertap/android/sdk/inapp/CTLocalInApp$Builder$Builder4;", "deviceOrientation", "", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class Builder3 {

            @NotNull
            private JSONObject jsonObject;

            public Builder3(@NotNull JSONObject jsonObject) {
                Intrinsics.echo(jsonObject, "jsonObject");
                this.jsonObject = jsonObject;
            }

            @NotNull
            public final Builder4 followDeviceOrientation(boolean deviceOrientation) {
                JSONObject jSONObject = this.jsonObject;
                jSONObject.put(Constants.KEY_PORTRAIT, true);
                jSONObject.put(Constants.KEY_LANDSCAPE, deviceOrientation);
                return new Builder4(jSONObject);
            }
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/clevertap/android/sdk/inapp/CTLocalInApp$Builder$Builder4;", "", "jsonObject", "Lorg/json/JSONObject;", "<init>", "(Lorg/json/JSONObject;)V", "setPositiveBtnText", "Lcom/clevertap/android/sdk/inapp/CTLocalInApp$Builder$Builder5;", "positiveBtnText", "", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class Builder4 {

            @NotNull
            private JSONObject jsonObject;

            public Builder4(@NotNull JSONObject jsonObject) {
                Intrinsics.echo(jsonObject, "jsonObject");
                this.jsonObject = jsonObject;
            }

            @NotNull
            public final Builder5 setPositiveBtnText(@NotNull String positiveBtnText) {
                Intrinsics.echo(positiveBtnText, "positiveBtnText");
                JSONObject jSONObject = this.jsonObject;
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(Constants.KEY_TEXT, positiveBtnText);
                jSONObject2.put(Constants.KEY_RADIUS, "2");
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put(Constants.KEY_TYPE, InAppActionType.CLOSE);
                jSONObject2.put(Constants.KEY_ACTIONS, jSONObject3);
                jSONObject.put(Constants.KEY_BUTTONS, new JSONArray().put(0, jSONObject2));
                return new Builder5(jSONObject);
            }
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/clevertap/android/sdk/inapp/CTLocalInApp$Builder$Builder5;", "", "jsonObject", "Lorg/json/JSONObject;", "<init>", "(Lorg/json/JSONObject;)V", "setNegativeBtnText", "Lcom/clevertap/android/sdk/inapp/CTLocalInApp$Builder$Builder6;", "negativeBtnText", "", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class Builder5 {

            @NotNull
            private JSONObject jsonObject;

            public Builder5(@NotNull JSONObject jsonObject) {
                Intrinsics.echo(jsonObject, "jsonObject");
                this.jsonObject = jsonObject;
            }

            @NotNull
            public final Builder6 setNegativeBtnText(@NotNull String negativeBtnText) {
                Intrinsics.echo(negativeBtnText, "negativeBtnText");
                JSONObject jSONObject = this.jsonObject;
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(Constants.KEY_TEXT, negativeBtnText);
                jSONObject2.put(Constants.KEY_RADIUS, "2");
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put(Constants.KEY_TYPE, InAppActionType.CLOSE);
                jSONObject2.put(Constants.KEY_ACTIONS, jSONObject3);
                jSONObject.getJSONArray(Constants.KEY_BUTTONS).put(1, jSONObject2);
                return new Builder6(jSONObject);
            }
        }

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\rJ\u001f\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000f\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\n¢\u0006\u0004\b\u0013\u0010\rJ\u0015\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\n¢\u0006\u0004\b\u0015\u0010\rJ\u0015\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\n¢\u0006\u0004\b\u0017\u0010\rJ\u0015\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\n¢\u0006\u0004\b\u0019\u0010\rJ\u0015\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\n¢\u0006\u0004\b\u001b\u0010\rJ\u0015\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\n¢\u0006\u0004\b\u001d\u0010\rJ\r\u0010\u001e\u001a\u00020\u0002¢\u0006\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010 R&\u0010#\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\"0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lcom/clevertap/android/sdk/inapp/CTLocalInApp$Builder$Builder6;", "", "Lorg/json/JSONObject;", "jsonObject", "<init>", "(Lorg/json/JSONObject;)V", "", "fallbackToSettings", "setFallbackToSettings", "(Z)Lcom/clevertap/android/sdk/inapp/CTLocalInApp$Builder$Builder6;", "", "backgroundColor", "setBackgroundColor", "(Ljava/lang/String;)Lcom/clevertap/android/sdk/inapp/CTLocalInApp$Builder$Builder6;", "imageUrl", "setImageUrl", "contentDescription", "(Ljava/lang/String;Ljava/lang/String;)Lcom/clevertap/android/sdk/inapp/CTLocalInApp$Builder$Builder6;", "titleTextColor", "setTitleTextColor", "messageTextColor", "setMessageTextColor", "btnTextColor", "setBtnTextColor", "btnBackgroundColor", "setBtnBackgroundColor", "btnBorderColor", "setBtnBorderColor", "btnBorderRadius", "setBtnBorderRadius", "build", "()Lorg/json/JSONObject;", "Lorg/json/JSONObject;", "Lkotlin/Function2;", "", "updateActionButtonArray", "LXd/l;", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class Builder6 {

            @NotNull
            private JSONObject jsonObject;

            @NotNull
            private final l updateActionButtonArray;

            public Builder6(@NotNull JSONObject jsonObject) {
                Intrinsics.echo(jsonObject, "jsonObject");
                this.jsonObject = jsonObject;
                this.updateActionButtonArray = new af(4, this);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit updateActionButtonArray$lambda$13(Builder6 this$0, String key, String value) {
                Intrinsics.echo(this$0, "this$0");
                Intrinsics.echo(key, "key");
                Intrinsics.echo(value, "value");
                Integer[] numArr = {0, 1};
                for (int i4 = 0; i4 < 2; i4++) {
                    this$0.jsonObject.getJSONArray(Constants.KEY_BUTTONS).getJSONObject(numArr[i4].intValue()).put(key, value);
                }
                return Unit.INSTANCE;
            }

            @NotNull
            /* renamed from: build, reason: from getter */
            public final JSONObject getJsonObject() {
                return this.jsonObject;
            }

            @NotNull
            public final Builder6 setBackgroundColor(@NotNull String backgroundColor) {
                Intrinsics.echo(backgroundColor, "backgroundColor");
                this.jsonObject.put(Constants.KEY_BG, backgroundColor);
                return this;
            }

            @NotNull
            public final Builder6 setBtnBackgroundColor(@NotNull String btnBackgroundColor) {
                Intrinsics.echo(btnBackgroundColor, "btnBackgroundColor");
                this.updateActionButtonArray.invoke(Constants.KEY_BG, btnBackgroundColor);
                return this;
            }

            @NotNull
            public final Builder6 setBtnBorderColor(@NotNull String btnBorderColor) {
                Intrinsics.echo(btnBorderColor, "btnBorderColor");
                this.updateActionButtonArray.invoke(Constants.KEY_BORDER, btnBorderColor);
                return this;
            }

            @NotNull
            public final Builder6 setBtnBorderRadius(@NotNull String btnBorderRadius) {
                Intrinsics.echo(btnBorderRadius, "btnBorderRadius");
                this.updateActionButtonArray.invoke(Constants.KEY_RADIUS, btnBorderRadius);
                return this;
            }

            @NotNull
            public final Builder6 setBtnTextColor(@NotNull String btnTextColor) {
                Intrinsics.echo(btnTextColor, "btnTextColor");
                this.updateActionButtonArray.invoke(Constants.KEY_COLOR, btnTextColor);
                return this;
            }

            @NotNull
            public final Builder6 setFallbackToSettings(boolean fallbackToSettings) {
                this.jsonObject.put(CTLocalInApp.FALLBACK_TO_NOTIFICATION_SETTINGS, fallbackToSettings);
                return this;
            }

            @NotNull
            public final Builder6 setImageUrl(@NotNull String imageUrl) {
                Intrinsics.echo(imageUrl, "imageUrl");
                return setImageUrl(imageUrl, null);
            }

            @NotNull
            public final Builder6 setMessageTextColor(@NotNull String messageTextColor) {
                Intrinsics.echo(messageTextColor, "messageTextColor");
                this.jsonObject.getJSONObject(Constants.KEY_MESSAGE).put(Constants.KEY_COLOR, messageTextColor);
                return this;
            }

            @NotNull
            public final Builder6 setTitleTextColor(@NotNull String titleTextColor) {
                Intrinsics.echo(titleTextColor, "titleTextColor");
                this.jsonObject.getJSONObject(Constants.KEY_TITLE).put(Constants.KEY_COLOR, titleTextColor);
                return this;
            }

            @NotNull
            public final Builder6 setImageUrl(@NotNull String imageUrl, @Nullable String contentDescription) {
                Intrinsics.echo(imageUrl, "imageUrl");
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(Constants.KEY_URL, imageUrl);
                jSONObject.put(Constants.KEY_CONTENT_TYPE, "image");
                if (contentDescription != null) {
                    jSONObject.put(Constants.KEY_ALT_TEXT, contentDescription);
                }
                JSONObject jSONObject2 = this.jsonObject;
                jSONObject2.put(Constants.KEY_MEDIA, jSONObject);
                if (jSONObject2.getBoolean(Constants.KEY_LANDSCAPE)) {
                    jSONObject2.put(Constants.KEY_MEDIA_LANDSCAPE, jSONObject);
                }
                return this;
            }
        }

        @NotNull
        public final Builder1 setInAppType(@NotNull InAppType inAppType) {
            Intrinsics.echo(inAppType, "inAppType");
            JSONObject jSONObject = this.jsonObject;
            jSONObject.put(Constants.KEY_TYPE, inAppType.getType());
            jSONObject.put(CTLocalInApp.IS_LOCAL_INAPP, true);
            jSONObject.put(Constants.KEY_HIDE_CLOSE, true);
            return new Builder1(jSONObject);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/clevertap/android/sdk/inapp/CTLocalInApp$Companion;", "", "<init>", "()V", "builder", "Lcom/clevertap/android/sdk/inapp/CTLocalInApp$Builder;", "IS_LOCAL_INAPP", "", "FALLBACK_TO_NOTIFICATION_SETTINGS", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Builder builder() {
            return new Builder();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/clevertap/android/sdk/inapp/CTLocalInApp$InAppType;", "", Constants.KEY_TYPE, "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getType", "()Ljava/lang/String;", "ALERT", "HALF_INTERSTITIAL", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class InAppType {
        private static final /* synthetic */ Qd.a $ENTRIES;
        private static final /* synthetic */ InAppType[] $VALUES;
        public static final InAppType ALERT = new InAppType("ALERT", 0, CTInAppType.CTInAppTypeAlert.getType());
        public static final InAppType HALF_INTERSTITIAL = new InAppType("HALF_INTERSTITIAL", 1, CTInAppType.CTInAppTypeHalfInterstitial.getType());

        @NotNull
        private final String type;

        private static final /* synthetic */ InAppType[] $values() {
            return new InAppType[]{ALERT, HALF_INTERSTITIAL};
        }

        static {
            InAppType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = AbstractC2708l7.bravo($values);
        }

        private InAppType(String str, int i4, String str2) {
            this.type = str2;
        }

        @NotNull
        public static Qd.a getEntries() {
            return $ENTRIES;
        }

        public static InAppType valueOf(String str) {
            return (InAppType) Enum.valueOf(InAppType.class, str);
        }

        public static InAppType[] values() {
            return (InAppType[]) $VALUES.clone();
        }

        @NotNull
        public final String getType() {
            return this.type;
        }
    }

    private CTLocalInApp() {
    }

    @NotNull
    public static final Builder builder() {
        return INSTANCE.builder();
    }
}

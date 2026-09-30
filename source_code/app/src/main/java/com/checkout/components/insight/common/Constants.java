package com.checkout.components.insight.common;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\bÀ\u0002\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\b\f\u0010\u0007R\u0014\u0010\r\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0014\u0010\u000e\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0007R\u0014\u0010\u0010\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/checkout/components/insight/common/Constants;", "", "", "CONNECT_TIMEOUT", "J", "", "CONTENT_TYPE", "Ljava/lang/String;", "CKO_SERVICE_VERSION", "CKO_SERVICE_NAME", "INSIGHT_API_URL_SANDBOX", "INSIGHT_API_URL_PRODUCTION", "PLATFORM", "READ_TIMEOUT", "WRITE_TIMEOUT", "DATE_TIME_PATTERN", "DATE_TIME_PATTERN_ISO_8601", "insight_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Constants {
    public static final String CKO_SERVICE_NAME = "CheckoutAndroidComponents";
    public static final String CKO_SERVICE_VERSION = "2.1.0";
    public static final long CONNECT_TIMEOUT = 30;
    public static final String CONTENT_TYPE = "application/json";
    public static final String DATE_TIME_PATTERN = "yyyy-MM-dd'T'HH:mm:ss.SSSZZZ";
    public static final String DATE_TIME_PATTERN_ISO_8601 = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX";
    public static final String INSIGHT_API_URL_PRODUCTION = "https://checkout-android-components-insights.checkout.com";
    public static final String INSIGHT_API_URL_SANDBOX = "https://checkout-android-components-insights.sandbox.checkout.com";
    public static final Constants INSTANCE = new Constants();
    public static final String PLATFORM = "android";
    public static final long READ_TIMEOUT = 30;
    public static final long WRITE_TIMEOUT = 50;

    private Constants() {
    }
}

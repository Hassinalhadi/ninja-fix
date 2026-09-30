package com.checkout.components.core.common;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\n\bÁ\u0002\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0014\u0010\u000e\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004¨\u0006\u000f"}, d2 = {"Lcom/checkout/components/core/common/Constants;", "", "", "CONTENT_TYPE", "Ljava/lang/String;", "", "CONNECT_TIMEOUT", "J", "READ_TIMEOUT", "WRITE_TIMEOUT", "RISK_PUBLISH_DATA_TIME_OUT_DURATION", "CKO_VERSION_HEADER", "CKO_SCHEMA_VERSION", "CKO_SERVICE_VERSION", "CKO_SERVICE_NAME", "core_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Constants {
    public static final int $stable = 0;

    @NotNull
    public static final String CKO_SCHEMA_VERSION = "0.0.0";

    @NotNull
    public static final String CKO_SERVICE_NAME = "CheckoutAndroidComponents";

    @NotNull
    public static final String CKO_SERVICE_VERSION = "2.1.0";

    @NotNull
    public static final String CKO_VERSION_HEADER = "Cko-Response-Version";
    public static final long CONNECT_TIMEOUT = 30;

    @NotNull
    public static final String CONTENT_TYPE = "application/json";

    @NotNull
    public static final Constants INSTANCE = new Constants();
    public static final long READ_TIMEOUT = 30;
    public static final long RISK_PUBLISH_DATA_TIME_OUT_DURATION = 5000;
    public static final long WRITE_TIMEOUT = 50;

    private Constants() {
    }
}

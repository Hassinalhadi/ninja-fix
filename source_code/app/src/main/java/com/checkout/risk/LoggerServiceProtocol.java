package com.checkout.risk;

import com.checkout.components.redirecthandler.customtab.RedirectCustomTabEventLogger;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001Ji\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fH&¢\u0006\u0002\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/checkout/risk/LoggerServiceProtocol;", "", "log", "", "riskEvent", "Lcom/checkout/risk/RiskEvent;", "blockTime", "", "deviceDataPersistTime", "fpLoadTime", "fpPublishTime", "deviceSessionID", "", "requestID", RedirectCustomTabEventLogger.RESULT_ERROR, "Lcom/checkout/risk/RiskLogError;", "(Lcom/checkout/risk/RiskEvent;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Lcom/checkout/risk/RiskLogError;)V", "Risk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface LoggerServiceProtocol {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ void log$default(LoggerServiceProtocol loggerServiceProtocol, RiskEvent riskEvent, Double d4, Double d9, Double d10, Double d11, String str, String str2, RiskLogError riskLogError, int i4, Object obj) {
            if (obj == null) {
                if ((i4 & 2) != 0) {
                    d4 = null;
                }
                if ((i4 & 4) != 0) {
                    d9 = null;
                }
                if ((i4 & 8) != 0) {
                    d10 = null;
                }
                if ((i4 & 16) != 0) {
                    d11 = null;
                }
                if ((i4 & 32) != 0) {
                    str = null;
                }
                if ((i4 & 64) != 0) {
                    str2 = null;
                }
                if ((i4 & 128) != 0) {
                    riskLogError = null;
                }
                loggerServiceProtocol.log(riskEvent, d4, d9, d10, d11, str, str2, riskLogError);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: log");
        }
    }

    void log(@NotNull RiskEvent riskEvent, @Nullable Double blockTime, @Nullable Double deviceDataPersistTime, @Nullable Double fpLoadTime, @Nullable Double fpPublishTime, @Nullable String deviceSessionID, @Nullable String requestID, @Nullable RiskLogError error);
}

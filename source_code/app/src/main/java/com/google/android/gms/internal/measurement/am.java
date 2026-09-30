package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.IInterface;
import h6.InterfaceC1812b;
import java.util.Map;

/* loaded from: classes2.dex */
public interface am extends IInterface {
    void beginAdUnitExposure(String str, long j5);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void clearMeasurementEnabled(long j5);

    void endAdUnitExposure(String str, long j5);

    void generateEventId(ao aoVar);

    void getAppInstanceId(ao aoVar);

    void getCachedAppInstanceId(ao aoVar);

    void getConditionalUserProperties(String str, String str2, ao aoVar);

    void getCurrentScreenClass(ao aoVar);

    void getCurrentScreenName(ao aoVar);

    void getGmpAppId(ao aoVar);

    void getMaxUserProperties(String str, ao aoVar);

    void getSessionId(ao aoVar);

    void getTestFlag(ao aoVar, int i4);

    void getUserProperties(String str, String str2, boolean z2, ao aoVar);

    void initForTests(Map map);

    void initialize(InterfaceC1812b interfaceC1812b, zzdh zzdhVar, long j5);

    void isDataCollectionEnabled(ao aoVar);

    void logEvent(String str, String str2, Bundle bundle, boolean z2, boolean z10, long j5);

    void logEventAndBundle(String str, String str2, Bundle bundle, ao aoVar, long j5);

    void logHealthData(int i4, String str, InterfaceC1812b interfaceC1812b, InterfaceC1812b interfaceC1812b2, InterfaceC1812b interfaceC1812b3);

    void onActivityCreated(InterfaceC1812b interfaceC1812b, Bundle bundle, long j5);

    void onActivityCreatedByScionActivityInfo(zzdj zzdjVar, Bundle bundle, long j5);

    void onActivityDestroyed(InterfaceC1812b interfaceC1812b, long j5);

    void onActivityDestroyedByScionActivityInfo(zzdj zzdjVar, long j5);

    void onActivityPaused(InterfaceC1812b interfaceC1812b, long j5);

    void onActivityPausedByScionActivityInfo(zzdj zzdjVar, long j5);

    void onActivityResumed(InterfaceC1812b interfaceC1812b, long j5);

    void onActivityResumedByScionActivityInfo(zzdj zzdjVar, long j5);

    void onActivitySaveInstanceState(InterfaceC1812b interfaceC1812b, ao aoVar, long j5);

    void onActivitySaveInstanceStateByScionActivityInfo(zzdj zzdjVar, ao aoVar, long j5);

    void onActivityStarted(InterfaceC1812b interfaceC1812b, long j5);

    void onActivityStartedByScionActivityInfo(zzdj zzdjVar, long j5);

    void onActivityStopped(InterfaceC1812b interfaceC1812b, long j5);

    void onActivityStoppedByScionActivityInfo(zzdj zzdjVar, long j5);

    void performAction(Bundle bundle, ao aoVar, long j5);

    void registerOnMeasurementEventListener(as asVar);

    void resetAnalyticsData(long j5);

    void retrieveAndUploadBatches(aq aqVar);

    void setConditionalUserProperty(Bundle bundle, long j5);

    void setConsent(Bundle bundle, long j5);

    void setConsentThirdParty(Bundle bundle, long j5);

    void setCurrentScreen(InterfaceC1812b interfaceC1812b, String str, String str2, long j5);

    void setCurrentScreenByScionActivityInfo(zzdj zzdjVar, String str, String str2, long j5);

    void setDataCollectionEnabled(boolean z2);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(as asVar);

    void setInstanceIdProvider(au auVar);

    void setMeasurementEnabled(boolean z2, long j5);

    void setMinimumSessionDuration(long j5);

    void setSessionTimeoutDuration(long j5);

    void setSgtmDebugInfo(Intent intent);

    void setUserId(String str, long j5);

    void setUserProperty(String str, String str2, InterfaceC1812b interfaceC1812b, boolean z2, long j5);

    void unregisterOnMeasurementEventListener(as asVar);
}

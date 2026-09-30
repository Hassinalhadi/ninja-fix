package N9;

import com.clevertap.android.sdk.Constants;
import java.util.List;
import java.util.Set;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import q3.AbstractC2410d;
import q3.C2407a;

/* loaded from: classes2.dex */
public abstract class a {
    public static final C2407a alpha;
    public static final C2407a bravo;
    public static final C2407a charlie;
    public static final C2407a delta;
    public static final C2407a echo;
    public static final C2407a foxtrot;
    public static final C2407a golf;
    public static final C2407a hotel;
    public static final C2407a india;
    public static final C2407a juliet;
    public static final Set kilo;
    public static final List lima;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [q3.a, q3.d] */
    /* JADX WARN: Type inference failed for: r0v17, types: [q3.a, q3.d] */
    /* JADX WARN: Type inference failed for: r0v19, types: [q3.a, q3.d] */
    /* JADX WARN: Type inference failed for: r0v23, types: [q3.a, q3.d] */
    /* JADX WARN: Type inference failed for: r0v28, types: [q3.a, q3.d] */
    /* JADX WARN: Type inference failed for: r0v30, types: [q3.a, q3.d] */
    /* JADX WARN: Type inference failed for: r0v31, types: [q3.a, q3.d] */
    /* JADX WARN: Type inference failed for: r2v12, types: [q3.a, q3.d] */
    /* JADX WARN: Type inference failed for: r2v22, types: [q3.a, q3.d] */
    /* JADX WARN: Type inference failed for: r3v5, types: [q3.a, q3.d] */
    static {
        AbstractC2410d abstractC2410d = new AbstractC2410d("location_interval", 4000L);
        AbstractC2410d abstractC2410d2 = new AbstractC2410d("location_fastest_interval", Long.valueOf(Constants.PN_LARGE_ICON_DOWNLOAD_TIMEOUT_IN_MILLIS));
        AbstractC2410d abstractC2410d3 = new AbstractC2410d("location_stuck_threshold_seconds", 60L);
        AbstractC2410d abstractC2410d4 = new AbstractC2410d("location_stuck_fallback_max_age_seconds", 120L);
        AbstractC2410d abstractC2410d5 = new AbstractC2410d("location_stuck_recovery_max_attempts", 3L);
        AbstractC2410d abstractC2410d6 = new AbstractC2410d("location_cold_start_max_age_seconds", 120L);
        AbstractC2410d abstractC2410d7 = new AbstractC2410d("location_cold_start_max_accuracy_meters", 200L);
        Boolean bool = Boolean.TRUE;
        AbstractC2410d abstractC2410d8 = new AbstractC2410d("location_send_validation_enabled", bool);
        AbstractC2410d abstractC2410d9 = new AbstractC2410d("location_force_send_max_age_seconds", 30L);
        AbstractC2410d abstractC2410d10 = new AbstractC2410d("location_force_send_max_accuracy_meters", 100L);
        AbstractC2410d abstractC2410d11 = new AbstractC2410d("location_validate_compare_with_last_sent", bool);
        AbstractC2410d abstractC2410d12 = new AbstractC2410d("location_validate_max_age_vs_last_sent_seconds", 60L);
        AbstractC2410d abstractC2410d13 = new AbstractC2410d("location_validate_max_distance_from_last_sent_meters", 10L);
        AbstractC2410d abstractC2410d14 = new AbstractC2410d("location_force_send_fresh_timeout_ms", 5000L);
        AbstractC2410d abstractC2410d15 = new AbstractC2410d("connection_timeout_interval", 10L);
        AbstractC2410d abstractC2410d16 = new AbstractC2410d("connection_read_timeout_interval", 30L);
        AbstractC2410d abstractC2410d17 = new AbstractC2410d("stomp_heart_beat_interval", 10L);
        Boolean bool2 = Boolean.FALSE;
        AbstractC2410d abstractC2410d18 = new AbstractC2410d("should_allow_mock_location", bool2);
        AbstractC2410d abstractC2410d19 = new AbstractC2410d("should_allow_multiple_allocation", bool);
        AbstractC2410d abstractC2410d20 = new AbstractC2410d("should_allow_withdraw_request", bool);
        AbstractC2410d abstractC2410d21 = new AbstractC2410d("should_allow_emulator", bool);
        AbstractC2410d abstractC2410d22 = new AbstractC2410d("force_send_before_completion_enabled", bool2);
        ?? abstractC2410d23 = new AbstractC2410d("send_captain_location_on_task_update", bool2);
        alpha = abstractC2410d23;
        AbstractC2410d abstractC2410d24 = new AbstractC2410d("enable_home_unified_scroll", bool);
        ?? abstractC2410d25 = new AbstractC2410d("enable_hybrid_multi_pickup", bool);
        bravo = abstractC2410d25;
        ?? abstractC2410d26 = new AbstractC2410d("enable_pickup_proof_always_available", bool);
        charlie = abstractC2410d26;
        ?? abstractC2410d27 = new AbstractC2410d("enable_pickup_items_without_handshake", bool);
        delta = abstractC2410d27;
        AbstractC2410d abstractC2410d28 = new AbstractC2410d("about_us_url", "https://www.samurai.delivery/");
        AbstractC2410d abstractC2410d29 = new AbstractC2410d("fake_gps_blocked_package_names", "");
        ?? abstractC2410d30 = new AbstractC2410d("test-samurai-app", bool2);
        echo = abstractC2410d30;
        foxtrot = new AbstractC2410d("edit-stc-account.enabled", bool2);
        AbstractC2410d abstractC2410d31 = new AbstractC2410d("security_hook_signals_enabled", bool2);
        AbstractC2410d abstractC2410d32 = new AbstractC2410d("security_tls_pinning_enabled", bool2);
        AbstractC2410d abstractC2410d33 = new AbstractC2410d("security_screen_hardening_enabled", bool2);
        AbstractC2410d abstractC2410d34 = new AbstractC2410d("security_obscured_touch_block_enabled", bool2);
        ?? abstractC2410d35 = new AbstractC2410d("location_reliability_enhancements", bool2);
        golf = abstractC2410d35;
        hotel = new AbstractC2410d("envelopes.v2.enabled", bool2);
        india = new AbstractC2410d("side_menu_v2.enabled", bool2);
        juliet = new AbstractC2410d("accounts_v2.enabled", bool2);
        kilo = ArraysKt.g(new String[]{"location_interval", "location_fastest_interval", "location_stuck_threshold_seconds", "location_stuck_fallback_max_age_seconds", "location_stuck_recovery_max_attempts", "location_cold_start_max_age_seconds", "location_cold_start_max_accuracy_meters", "location_send_validation_enabled", "location_force_send_max_age_seconds", "location_force_send_max_accuracy_meters", "location_validate_compare_with_last_sent", "location_validate_max_age_vs_last_sent_seconds", "location_validate_max_distance_from_last_sent_meters", "location_force_send_fresh_timeout_ms", "connection_timeout_interval", "connection_read_timeout_interval", "stomp_heart_beat_interval", "should_allow_mock_location", "should_allow_multiple_allocation", "should_allow_withdraw_request", "should_allow_emulator", "force_send_before_completion_enabled", "enable_home_unified_scroll", "about_us_url", "fake_gps_blocked_package_names", "security_hook_signals_enabled", "security_tls_pinning_enabled", "security_screen_hardening_enabled", "security_obscured_touch_block_enabled"});
        lima = CollectionsKt.listOf(abstractC2410d, abstractC2410d2, abstractC2410d3, abstractC2410d4, abstractC2410d5, abstractC2410d6, abstractC2410d7, abstractC2410d8, abstractC2410d9, abstractC2410d10, abstractC2410d11, abstractC2410d12, abstractC2410d13, abstractC2410d14, abstractC2410d15, abstractC2410d16, abstractC2410d17, abstractC2410d18, abstractC2410d19, abstractC2410d20, abstractC2410d21, abstractC2410d22, abstractC2410d23, abstractC2410d24, abstractC2410d25, abstractC2410d26, abstractC2410d27, abstractC2410d28, abstractC2410d29, abstractC2410d30, abstractC2410d31, abstractC2410d32, abstractC2410d33, abstractC2410d34, abstractC2410d35);
    }
}

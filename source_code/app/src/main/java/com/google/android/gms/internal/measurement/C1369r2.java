package com.google.android.gms.internal.measurement;

import com.clevertap.android.sdk.Constants;

/* renamed from: com.google.android.gms.internal.measurement.r2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1369r2 implements InterfaceC1366q2 {

    /* renamed from: a, reason: collision with root package name */
    public static final C1320g1 f6685a;
    public static final C1320g1 alpha;
    public static final C1320g1 amber;
    public static final C1320g1 azure;

    /* renamed from: b, reason: collision with root package name */
    public static final C1320g1 f6686b;
    public static final C1320g1 beige;
    public static final C1320g1 black;
    public static final C1320g1 blue;
    public static final C1320g1 bravo;
    public static final C1320g1 bronze;

    /* renamed from: c, reason: collision with root package name */
    public static final C1320g1 f6687c;
    public static final C1320g1 charlie;
    public static final C1320g1 coral;
    public static final C1320g1 crimson;
    public static final C1320g1 cyan;

    /* renamed from: d, reason: collision with root package name */
    public static final C1320g1 f6688d;
    public static final C1320g1 delta;
    public static final C1320g1 e;
    public static final C1320g1 echo;
    public static final C1320g1 emerald;

    /* renamed from: f, reason: collision with root package name */
    public static final C1320g1 f6689f;
    public static final C1320g1 foxtrot;
    public static final C1320g1 fuchsia;

    /* renamed from: g, reason: collision with root package name */
    public static final C1320g1 f6690g;
    public static final C1320g1 gold;
    public static final C1320g1 golf;
    public static final C1320g1 gray;
    public static final C1320g1 green;

    /* renamed from: h, reason: collision with root package name */
    public static final C1320g1 f6691h;
    public static final C1320g1 hotel;

    /* renamed from: i, reason: collision with root package name */
    public static final C1320g1 f6692i;
    public static final C1320g1 india;
    public static final C1320g1 indigo;
    public static final C1320g1 ivory;

    /* renamed from: j, reason: collision with root package name */
    public static final C1320g1 f6693j;
    public static final C1320g1 jade;
    public static final C1320g1 juliet;

    /* renamed from: k, reason: collision with root package name */
    public static final C1320g1 f6694k;
    public static final C1320g1 kilo;

    /* renamed from: l, reason: collision with root package name */
    public static final C1320g1 f6695l;
    public static final C1320g1 lavender;
    public static final C1320g1 lima;
    public static final C1320g1 lime;
    public static final C1320g1 magenta;
    public static final C1320g1 maroon;
    public static final C1320g1 mike;
    public static final C1320g1 navy;
    public static final C1320g1 november;
    public static final C1320g1 ochre;
    public static final C1320g1 olive;
    public static final C1320g1 orange;
    public static final C1320g1 oscar;
    public static final C1320g1 papa;
    public static final C1320g1 peach;
    public static final C1320g1 pink;
    public static final C1320g1 plum;
    public static final C1320g1 purple;
    public static final C1320g1 quebec;
    public static final C1320g1 red;
    public static final C1320g1 romeo;
    public static final C1320g1 sierra;
    public static final C1320g1 silver;
    public static final C1320g1 tango;
    public static final C1320g1 teal;
    public static final C1320g1 uniform;
    public static final C1320g1 victor;
    public static final C1320g1 whiskey;
    public static final C1320g1 white;
    public static final C1320g1 xray;
    public static final C1320g1 yankee;
    public static final C1320g1 yellow;
    public static final C1320g1 zulu;

    static {
        Pf.j jVar = new Pf.j(AbstractC1305d1.alpha(), true, true);
        alpha = jVar.victor(10000L, "measurement.ad_id_cache_time");
        bravo = jVar.victor(3600000L, "measurement.app_uninstalled_additional_ad_id_cache_time");
        charlie = jVar.yankee("measurement.config.bundle_for_all_apps_on_backgrounded", true);
        delta = jVar.victor(100L, "measurement.max_bundles_per_iteration");
        echo = jVar.victor(Constants.ONE_DAY_IN_MILLIS, "measurement.config.cache_time");
        jVar.whiskey("measurement.log_tag", "FA");
        foxtrot = jVar.whiskey("measurement.config.url_authority", "app-measurement.com");
        golf = jVar.whiskey("measurement.config.url_scheme", "https");
        hotel = jVar.victor(1000L, "measurement.upload.debug_upload_interval");
        india = jVar.victor(3600000L, "measurement.session.engagement_interval");
        juliet = jVar.whiskey("measurement.rb.attribution.event_params", "value|currency");
        kilo = jVar.victor(605000L, "measurement.upload.google_signal_max_queue_time");
        lima = jVar.whiskey("measurement.sgtm.google_signal.url", "https://app-measurement.com/s/d");
        mike = jVar.victor(4L, "measurement.lifetimevalue.max_currency_tracked");
        november = jVar.victor(1L, "measurement.dma_consent.max_daily_dcu_realtime_events");
        oscar = jVar.victor(500L, "measurement.upload.max_event_parameter_value_length");
        papa = jVar.victor(100000L, "measurement.store.max_stored_events_per_app");
        quebec = jVar.victor(50L, "measurement.experiment.max_ids");
        romeo = jVar.victor(200L, "measurement.audience.filter_result_max_count");
        sierra = jVar.victor(27L, "measurement.upload.max_item_scoped_custom_parameters");
        tango = jVar.victor(1000L, "measurement.rb.max_trigger_registrations_per_day");
        uniform = jVar.victor(0L, "measurement.rb.attribution.max_trigger_uris_queried_at_once");
        victor = jVar.victor(7L, "measurement.rb.attribution.client.min_ad_services_version");
        whiskey = jVar.victor(60000L, "measurement.alarm_manager.minimum_interval");
        xray = jVar.victor(500L, "measurement.upload.minimum_delay");
        yankee = jVar.victor(Constants.ONE_DAY_IN_MILLIS, "measurement.monitoring.sample_period_millis");
        zulu = jVar.victor(3000L, "measurement.rb.attribution.notify_app_delay_millis");
        amber = jVar.yankee("measurement.config.notify_trigger_uris_on_backgrounded", true);
        azure = jVar.whiskey("measurement.rb.attribution.app_allowlist", "*");
        beige = jVar.victor(10000L, "measurement.upload.realtime_upload_interval");
        black = jVar.victor(604800000L, "measurement.upload.refresh_blacklisted_config_interval");
        jVar.victor(3600000L, "measurement.config.cache_time.service");
        blue = jVar.victor(5000L, "measurement.service_client.idle_disconnect_millis");
        jVar.whiskey("measurement.log_tag.service", "FA-SVC");
        bronze = jVar.victor(1000L, "measurement.service_client.reconnect_millis");
        jVar.whiskey("measurement.sgtm.app_allowlist", "*");
        coral = jVar.victor(1800000L, "measurement.sgtm.batch.retry_interval");
        crimson = jVar.victor(10L, "measurement.sgtm.batch.retry_max_count");
        cyan = jVar.victor(21600000L, "measurement.sgtm.batch.retry_max_wait");
        emerald = jVar.whiskey("measurement.sgtm.service_upload_apps_list", "");
        fuchsia = jVar.whiskey("measurement.sgtm.upload.backoff_http_codes", "404,429,503,504");
        gold = jVar.victor(5L, "measurement.sgtm.upload.batches_retrieval_limit");
        gray = jVar.victor(5000L, "measurement.sgtm.upload.max_queued_batches");
        green = jVar.victor(600000L, "measurement.sgtm.upload.min_delay_after_background");
        indigo = jVar.victor(1000L, "measurement.sgtm.upload.min_delay_after_broadcast");
        ivory = jVar.victor(5000L, "measurement.sgtm.upload.min_delay_after_startup");
        jade = jVar.victor(600000L, "measurement.sgtm.upload.retry_interval");
        lavender = jVar.victor(21600000L, "measurement.sgtm.upload.retry_max_wait");
        lime = jVar.victor(Constants.ONE_DAY_IN_MILLIS, "measurement.upload.stale_data_deletion_interval");
        magenta = jVar.victor(16L, "measurement.rb.attribution.max_retry_delay_seconds");
        maroon = jVar.victor(90L, "measurement.rb.attribution.client.min_time_after_boot_seconds");
        navy = jVar.whiskey("measurement.rb.attribution.uri_authority", "google-analytics.com");
        ochre = jVar.victor(864000000L, "measurement.rb.attribution.max_queue_time");
        olive = jVar.whiskey("measurement.rb.attribution.uri_path", "privacy-sandbox/register-app-conversion");
        orange = jVar.whiskey("measurement.rb.attribution.query_parameters_to_remove", "");
        peach = jVar.whiskey("measurement.rb.attribution.uri_scheme", "https");
        pink = jVar.victor(604800000L, "measurement.sdk.attribution.cache.ttl");
        plum = jVar.victor(7200000L, "measurement.redaction.app_instance_id.ttl");
        purple = jVar.victor(43200000L, "measurement.upload.backoff_period");
        red = jVar.victor(15000L, "measurement.upload.initial_upload_delay_time");
        silver = jVar.victor(3600000L, "measurement.upload.interval");
        teal = jVar.victor(65536L, "measurement.upload.max_bundle_size");
        white = jVar.victor(100L, "measurement.upload.max_bundles");
        yellow = jVar.victor(500L, "measurement.upload.max_conversions_per_day");
        f6685a = jVar.victor(1000L, "measurement.upload.max_error_events_per_day");
        f6686b = jVar.victor(1000L, "measurement.upload.max_events_per_bundle");
        f6687c = jVar.victor(100000L, "measurement.upload.max_events_per_day");
        f6688d = jVar.victor(50000L, "measurement.upload.max_public_events_per_day");
        e = jVar.victor(518400000L, "measurement.upload.max_queue_time");
        f6689f = jVar.victor(10L, "measurement.upload.max_realtime_events_per_day");
        f6690g = jVar.victor(65536L, "measurement.upload.max_batch_size");
        f6691h = jVar.victor(6L, "measurement.upload.retry_count");
        f6692i = jVar.victor(1800000L, "measurement.upload.retry_time");
        f6693j = jVar.whiskey("measurement.upload.url", "https://app-measurement.com/a");
        f6694k = jVar.victor(3600000L, "measurement.upload.window_interval");
        f6695l = jVar.whiskey("measurement.rb.attribution.user_properties", "_npa,npa|_fot,fot");
    }
}

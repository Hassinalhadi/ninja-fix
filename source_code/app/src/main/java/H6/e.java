package H6;

import com.google.android.gms.common.Feature;

/* loaded from: classes2.dex */
public abstract class e {
    public static final com.google.android.gms.common.api.e alpha = new com.google.android.gms.common.api.e("Wallet.API", new D6.b(2), new Object());
    public static final Feature bravo;
    public static final Feature[] charlie;

    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.gms.common.api.d, java.lang.Object] */
    static {
        Feature feature = new Feature("wallet", 1L);
        Feature feature2 = new Feature("wallet_biometric_auth_keys", 1L);
        Feature feature3 = new Feature("wallet_payment_dynamic_update", 2L);
        bravo = feature3;
        charlie = new Feature[]{feature, feature2, feature3, new Feature("wallet_1p_initialize_buyflow", 1L), new Feature("wallet_warm_up_ui_process", 1L), new Feature("wallet_get_setup_wizard_intent", 4L), new Feature("wallet_get_payment_card_recognition_intent", 1L), new Feature("wallet_save_instrument", 1L)};
    }
}

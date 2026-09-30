package B9;

import android.util.SparseIntArray;
import delivery.samurai.android.R;

/* renamed from: B9.t, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0065t extends AbstractC0063s {

    /* renamed from: y0, reason: collision with root package name */
    public static final SparseIntArray f690y0;

    /* renamed from: x0, reason: collision with root package name */
    public long f691x0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f690y0 = sparseIntArray;
        sparseIntArray.put(R.id.toolbar, 1);
        sparseIntArray.put(R.id.scrollView, 2);
        sparseIntArray.put(R.id.info, 3);
        sparseIntArray.put(R.id.tvPersonalInfo, 4);
        sparseIntArray.put(R.id.btnPersonalInfoArrow, 5);
        sparseIntArray.put(R.id.expandableLayoutPersonalInfo, 6);
        sparseIntArray.put(R.id.ilFName, 7);
        sparseIntArray.put(R.id.etFName, 8);
        sparseIntArray.put(R.id.ilLName, 9);
        sparseIntArray.put(R.id.etLName, 10);
        sparseIntArray.put(R.id.ilIDNumber, 11);
        sparseIntArray.put(R.id.etIDNumber, 12);
        sparseIntArray.put(R.id.ilDob, 13);
        sparseIntArray.put(R.id.etDob, 14);
        sparseIntArray.put(R.id.ilPreference, 15);
        sparseIntArray.put(R.id.etPreference, 16);
        sparseIntArray.put(R.id.ilPlatform, 17);
        sparseIntArray.put(R.id.etPlatform, 18);
        sparseIntArray.put(R.id.ilNationality, 19);
        sparseIntArray.put(R.id.etNationality, 20);
        sparseIntArray.put(R.id.ilCountry, 21);
        sparseIntArray.put(R.id.etCountry, 22);
        sparseIntArray.put(R.id.ilCity, 23);
        sparseIntArray.put(R.id.etCity, 24);
        sparseIntArray.put(R.id.ilMobileNo, 25);
        sparseIntArray.put(R.id.etMobileNo, 26);
        sparseIntArray.put(R.id.lbReferral, 27);
        sparseIntArray.put(R.id.ilReferralCode, 28);
        sparseIntArray.put(R.id.etReferralNo, 29);
        sparseIntArray.put(R.id.tvBankDetail, 30);
        sparseIntArray.put(R.id.btnBankDetailsArrow, 31);
        sparseIntArray.put(R.id.expandableLayoutBankDetail, 32);
        sparseIntArray.put(R.id.ilFintechId, 33);
        sparseIntArray.put(R.id.etFintechId, 34);
        sparseIntArray.put(R.id.ilIbanName, 35);
        sparseIntArray.put(R.id.etibanName, 36);
        sparseIntArray.put(R.id.ilIbanNo, 37);
        sparseIntArray.put(R.id.etIbanNumber, 38);
        sparseIntArray.put(R.id.ilBankName, 39);
        sparseIntArray.put(R.id.etBankName, 40);
        sparseIntArray.put(R.id.tvLicenseInfo, 41);
        sparseIntArray.put(R.id.btnLicenseInfoArrow, 42);
        sparseIntArray.put(R.id.expandableLayoutLicencesInfo, 43);
        sparseIntArray.put(R.id.ilVehiclePlate, 44);
        sparseIntArray.put(R.id.etVehicle, 45);
        sparseIntArray.put(R.id.ilVehicleSequenceNumber, 46);
        sparseIntArray.put(R.id.etVehicleSequenceNumber, 47);
        sparseIntArray.put(R.id.fabAddIdCardSnap, 48);
        sparseIntArray.put(R.id.view5, 49);
        sparseIntArray.put(R.id.t1, 50);
        sparseIntArray.put(R.id.ivIdCardSnap, 51);
        sparseIntArray.put(R.id.btnClearIdCardSnap, 52);
        sparseIntArray.put(R.id.idSnapErrorMsg, 53);
        sparseIntArray.put(R.id.fabAddDrivingLicenseSnap, 54);
        sparseIntArray.put(R.id.view4, 55);
        sparseIntArray.put(R.id.ivDrivingLicenseSnap, 56);
        sparseIntArray.put(R.id.btnClearDrivingLicenseSnap, 57);
        sparseIntArray.put(R.id.drivingSnapErrorMsg, 58);
        sparseIntArray.put(R.id.fabAddIdRegistrationSnap, 59);
        sparseIntArray.put(R.id.view3, 60);
        sparseIntArray.put(R.id.ivRegistrationSnap, 61);
        sparseIntArray.put(R.id.btnClearRegistrationSnap, 62);
        sparseIntArray.put(R.id.registrationSnapErrorMsg, 63);
        sparseIntArray.put(R.id.fabAddProfileSnap, 64);
        sparseIntArray.put(R.id.view7, 65);
        sparseIntArray.put(R.id.ivProfilePicture, 66);
        sparseIntArray.put(R.id.btnClearProfileSnap, 67);
        sparseIntArray.put(R.id.profileSnapErrorMsg, 68);
        sparseIntArray.put(R.id.btnSubmitSignUp, 69);
    }

    @Override // z1.g
    public final void foxtrot() {
        synchronized (this) {
            this.f691x0 = 0L;
        }
    }

    @Override // z1.g
    public final boolean juliet() {
        synchronized (this) {
            try {
                if (this.f691x0 != 0) {
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // z1.g
    public final void lima() {
        synchronized (this) {
            this.f691x0 = 1L;
        }
        oscar();
    }
}

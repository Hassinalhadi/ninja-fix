package com.incognia.internal;

import android.content.Context;
import android.os.Process;
import android.os.UserHandle;
import android.os.UserManager;
import g3.z;
import java.util.List;

/* loaded from: classes2.dex */
public final class xi8 {

    /* renamed from: b, reason: collision with root package name */
    public final UserManager f11811b;

    public xi8(Context context) {
        this.f11811b = (UserManager) context.getSystemService("user");
    }

    public static Boolean b() {
        boolean supportsMultipleUsers;
        if (CnH.b(CnH.f8484b, 24, 0, 2)) {
            try {
                supportsMultipleUsers = UserManager.supportsMultipleUsers();
                return Boolean.valueOf(supportsMultipleUsers);
            } catch (Throwable unused) {
                return null;
            }
        }
        return null;
    }

    public static Boolean gmP() {
        if (CnH.b(CnH.f8484b, 31, 0, 2)) {
            try {
                return Boolean.valueOf(z.yankee());
            } catch (Throwable unused) {
                return null;
            }
        }
        return null;
    }

    public final Boolean DOu() {
        boolean isUserUnlocked;
        if (CnH.b(CnH.f8484b, 24, 0, 2)) {
            try {
                isUserUnlocked = this.f11811b.isUserUnlocked();
                return Boolean.valueOf(isUserUnlocked);
            } catch (Throwable unused) {
                return null;
            }
        }
        return null;
    }

    public final Boolean J() {
        boolean isManagedProfile;
        if (CnH.b(CnH.f8484b, 30, 0, 2)) {
            try {
                isManagedProfile = this.f11811b.isManagedProfile();
                return Boolean.valueOf(isManagedProfile);
            } catch (Throwable unused) {
                return null;
            }
        }
        return null;
    }

    public final Boolean PqK() {
        boolean isProfile;
        if (CnH.b(CnH.f8484b, 33, 0, 2)) {
            try {
                isProfile = this.f11811b.isProfile();
                return Boolean.valueOf(isProfile);
            } catch (Throwable unused) {
                return null;
            }
        }
        return null;
    }

    public final Boolean R() {
        if (CnH.b(CnH.f8484b, 31, 0, 2)) {
            try {
                return Boolean.valueOf(z.amber(this.f11811b));
            } catch (Throwable unused) {
                return null;
            }
        }
        return null;
    }

    public final Boolean V() {
        boolean isQuietModeEnabled;
        if (CnH.b(CnH.f8484b, 24, 0, 2)) {
            try {
                isQuietModeEnabled = this.f11811b.isQuietModeEnabled(Process.myUserHandle());
                return Boolean.valueOf(isQuietModeEnabled);
            } catch (Throwable unused) {
                return null;
            }
        }
        return null;
    }

    public final Integer W() {
        if (CnH.b(CnH.f8484b, 21, 0, 2)) {
            try {
                List<UserHandle> userProfiles = this.f11811b.getUserProfiles();
                if (userProfiles != null) {
                    return Integer.valueOf(userProfiles.size());
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public final Boolean f9() {
        boolean isAdminUser;
        if (CnH.b(CnH.f8484b, 34, 0, 2)) {
            try {
                isAdminUser = this.f11811b.isAdminUser();
                return Boolean.valueOf(isAdminUser);
            } catch (Throwable unused) {
                return null;
            }
        }
        return null;
    }

    public final Boolean olU() {
        if (CnH.b(CnH.f8484b, 23, 0, 2)) {
            try {
                return Boolean.valueOf(this.f11811b.isSystemUser());
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public final Boolean sVU() {
        boolean isDemoUser;
        if (CnH.b(CnH.f8484b, 25, 0, 2)) {
            try {
                isDemoUser = this.f11811b.isDemoUser();
                return Boolean.valueOf(isDemoUser);
            } catch (Throwable unused) {
                return null;
            }
        }
        return null;
    }
}

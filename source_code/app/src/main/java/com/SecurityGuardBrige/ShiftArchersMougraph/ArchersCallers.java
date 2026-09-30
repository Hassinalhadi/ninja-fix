package com.SecurityGuardBrige.ShiftArchersMougraph;

import KingArchersMougraphAlsopromas0.AlwaysMougraohSmootihbngmode;
import KingArchersMougraphAlsopromas0.hidden.Hidden0;
import android.app.Activity;
import android.content.Context;
import delivery.samurai.android.ui.areasV2.AreaListingActivityV2;
import delivery.samurai.android.ui.shiftBookingV2.ShiftBookingListingActivityV2;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Dex2C */
/* loaded from: classes.dex */
public final class ArchersCallers {
    static {
        AlwaysMougraohSmootihbngmode.registerNativesForClass(66, ArchersCallers.class);
        Hidden0.special_clinit_66_00(ArchersCallers.class);
    }

    public static native void ArchersAreaRefreshing(AreaListingActivityV2 areaListingActivityV2);

    public static native ArrayList ArchersGetShifts(ShiftBookingListingActivityV2 shiftBookingListingActivityV2);

    public static native void ArchersRemoveEmptyBranch(AreaListingActivityV2 areaListingActivityV2, String str);

    public static native void ArchersShiftBooks(ShiftBookingListingActivityV2 shiftBookingListingActivityV2, long j5);

    public static native void ArchersShiftRefreshing(ShiftBookingListingActivityV2 shiftBookingListingActivityV2);

    public static native void areaOnResumeAdded(AreaListingActivityV2 areaListingActivityV2);

    public static native void areaPostSetup(AreaListingActivityV2 areaListingActivityV2);

    public static native boolean areaTabSelector(AreaListingActivityV2 areaListingActivityV2);

    public static native void cbShiftSuccessToast(Context context);

    public static native void l9AddedQueueFromString(String str, Context context);

    public static native void l9AddedQueueMessage(Context context, String str);

    public static native void oaAreaItemsReady(AreaListingActivityV2 areaListingActivityV2, ArrayList arrayList);

    public static native void oaAutoClick(Activity activity, List list);

    public static native void oaEmptyToast(AreaListingActivityV2 areaListingActivityV2);

    public static native void oaResetSwipe(AreaListingActivityV2 areaListingActivityV2);

    public static native void oaSortBranches(ArrayList arrayList);

    public static native void shiftOnCreateRefresh(ShiftBookingListingActivityV2 shiftBookingListingActivityV2);

    public static native void zcAutoBookTail(ShiftBookingListingActivityV2 shiftBookingListingActivityV2);
}

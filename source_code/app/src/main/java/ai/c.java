package ai;

import ah.j;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.ext.SdkExtensions;
import android.provider.MediaStore;
import com.airbnb.lottie.compose.LottieConstants;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import t6.AbstractC3027m3;

/* loaded from: classes3.dex */
public final class c extends b {
    public final int alpha;

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0010, code lost:
    
        if (r0 >= 2) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public c() {
        int pickImagesMaxLimit;
        int extensionVersion;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 33) {
            if (i4 >= 30) {
                extensionVersion = SdkExtensions.getExtensionVersion(30);
            }
            pickImagesMaxLimit = LottieConstants.IterateForever;
            this.alpha = pickImagesMaxLimit;
            if (pickImagesMaxLimit <= 1) {
                return;
            } else {
                throw new IllegalArgumentException("Max items must be higher than 1");
            }
        }
        pickImagesMaxLimit = MediaStore.getPickImagesMaxLimit();
        this.alpha = pickImagesMaxLimit;
        if (pickImagesMaxLimit <= 1) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0019, code lost:
    
        if (r0 >= 2) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    @Override // ai.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Intent alpha(Context context, Object obj) {
        boolean z2;
        int pickImagesMaxLimit;
        int extensionVersion;
        j input = (j) obj;
        Intrinsics.echo(input, "input");
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 33) {
            if (i4 >= 30) {
                extensionVersion = SdkExtensions.getExtensionVersion(30);
            }
            z2 = false;
            int i5 = this.alpha;
            if (!z2) {
                Intent intent = new Intent("android.provider.action.PICK_IMAGES");
                AbstractC3027m3.bravo(input.alpha);
                intent.setType(null);
                int min = Math.min(i5, input.bravo);
                if (min > 1) {
                    pickImagesMaxLimit = MediaStore.getPickImagesMaxLimit();
                    if (min <= pickImagesMaxLimit) {
                        intent.putExtra("android.provider.extra.PICK_IMAGES_MAX", min);
                        input.charlie.getClass();
                        intent.putExtra("android.provider.extra.PICK_IMAGES_LAUNCH_TAB", 1);
                        intent.putExtra("android.provider.extra.PICK_IMAGES_IN_ORDER", false);
                        return intent;
                    }
                }
                throw new IllegalArgumentException("Max items must be greater than 1 and lesser than or equal to MediaStore.getPickImagesMaxLimit()");
            }
            if (context.getPackageManager().resolveActivity(new Intent("androidx.activity.result.contract.action.PICK_IMAGES"), 1114112) != null) {
                ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(new Intent("androidx.activity.result.contract.action.PICK_IMAGES"), 1114112);
                if (resolveActivity != null) {
                    ActivityInfo activityInfo = resolveActivity.activityInfo;
                    Intent intent2 = new Intent("androidx.activity.result.contract.action.PICK_IMAGES");
                    intent2.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);
                    AbstractC3027m3.bravo(input.alpha);
                    intent2.setType(null);
                    int min2 = Math.min(i5, input.bravo);
                    if (min2 > 1) {
                        intent2.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_MAX", min2);
                        input.charlie.getClass();
                        intent2.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_LAUNCH_TAB", 1);
                        intent2.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_IN_ORDER", false);
                        return intent2;
                    }
                    throw new IllegalArgumentException("Max items must be greater than 1");
                }
                throw new IllegalStateException("Required value was null.");
            }
            Intent intent3 = new Intent("android.intent.action.OPEN_DOCUMENT");
            AbstractC3027m3.bravo(input.alpha);
            intent3.setType(null);
            intent3.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            if (intent3.getType() == null) {
                intent3.setType("*/*");
                intent3.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
            }
            return intent3;
        }
        z2 = true;
        int i52 = this.alpha;
        if (!z2) {
        }
    }

    @Override // ai.b
    public final a bravo(Context context, Object obj) {
        j input = (j) obj;
        Intrinsics.echo(input, "input");
        return null;
    }

    @Override // ai.b
    public final Object charlie(Intent intent, int i4) {
        Object arrayList;
        if (i4 != -1) {
            intent = null;
        }
        if (intent != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Uri data = intent.getData();
            if (data != null) {
                linkedHashSet.add(data);
            }
            ClipData clipData = intent.getClipData();
            if (clipData == null && linkedHashSet.isEmpty()) {
                arrayList = CollectionsKt.emptyList();
            } else {
                if (clipData != null) {
                    int itemCount = clipData.getItemCount();
                    for (int i5 = 0; i5 < itemCount; i5++) {
                        Uri uri = clipData.getItemAt(i5).getUri();
                        if (uri != null) {
                            linkedHashSet.add(uri);
                        }
                    }
                }
                arrayList = new ArrayList(linkedHashSet);
            }
            if (arrayList != null) {
                return arrayList;
            }
        }
        return CollectionsKt.emptyList();
    }
}

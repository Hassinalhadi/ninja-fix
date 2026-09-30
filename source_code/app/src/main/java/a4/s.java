package a4;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import androidx.fragment.app.L;
import com.canhub.cropper.CropImage$ActivityResult;
import com.canhub.cropper.CropImageActivity;
import g1.AbstractC1735d;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.Pair;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class s extends ai.b {
    public final /* synthetic */ int alpha;

    public /* synthetic */ s(int i4) {
        this.alpha = i4;
    }

    @Override // ai.b
    public final Intent alpha(Context context, Object obj) {
        Bundle bundleExtra;
        switch (this.alpha) {
            case 0:
                t input = (t) obj;
                Intrinsics.echo(input, "input");
                Intent intent = new Intent(context, (Class<?>) CropImageActivity.class);
                Bundle bundle = new Bundle(2);
                bundle.putParcelable("CROP_IMAGE_EXTRA_SOURCE", null);
                bundle.putParcelable("CROP_IMAGE_EXTRA_OPTIONS", input.alpha);
                intent.putExtra("CROP_IMAGE_EXTRA_BUNDLE", bundle);
                return intent;
            case 1:
                String input2 = (String) obj;
                Intrinsics.echo(input2, "input");
                Intent type = new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType(input2);
                Intrinsics.delta(type, "Intent(Intent.ACTION_GET…          .setType(input)");
                return type;
            case 2:
                String[] input3 = (String[]) obj;
                Intrinsics.echo(input3, "input");
                Intent type2 = new Intent("android.intent.action.OPEN_DOCUMENT").putExtra("android.intent.extra.MIME_TYPES", input3).putExtra("android.intent.extra.ALLOW_MULTIPLE", true).setType("*/*");
                Intrinsics.delta(type2, "Intent(Intent.ACTION_OPE…          .setType(\"*/*\")");
                return type2;
            case 3:
                String[] input4 = (String[]) obj;
                Intrinsics.echo(input4, "input");
                Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", input4);
                Intrinsics.delta(putExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
                return putExtra;
            case 4:
                String input5 = (String) obj;
                Intrinsics.echo(input5, "input");
                Intent putExtra2 = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", new String[]{input5});
                Intrinsics.delta(putExtra2, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
                return putExtra2;
            case 5:
                Intent input6 = (Intent) obj;
                Intrinsics.echo(input6, "input");
                return input6;
            case 6:
                IntentSenderRequest input7 = (IntentSenderRequest) obj;
                Intrinsics.echo(input7, "input");
                Intent putExtra3 = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", input7);
                Intrinsics.delta(putExtra3, "Intent(ACTION_INTENT_SEN…NT_SENDER_REQUEST, input)");
                return putExtra3;
            case 7:
                Uri input8 = (Uri) obj;
                Intrinsics.echo(input8, "input");
                Intent putExtra4 = new Intent("android.media.action.IMAGE_CAPTURE").putExtra("output", input8);
                Intrinsics.delta(putExtra4, "Intent(MediaStore.ACTION…tore.EXTRA_OUTPUT, input)");
                return putExtra4;
            default:
                IntentSenderRequest intentSenderRequest = (IntentSenderRequest) obj;
                Intent intent2 = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
                Intent intent3 = intentSenderRequest.purple;
                if (intent3 != null && (bundleExtra = intent3.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                    intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                    intent3.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    if (intent3.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                        IntentSender intentSender = intentSenderRequest.alpha;
                        Intrinsics.echo(intentSender, "intentSender");
                        intentSenderRequest = new IntentSenderRequest(intentSender, null, intentSenderRequest.red, intentSenderRequest.silver);
                    }
                }
                intent2.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", intentSenderRequest);
                if (L.gray(2)) {
                    Log.v("FragmentManager", "CreateIntent created the following intent: " + intent2);
                }
                return intent2;
        }
    }

    @Override // ai.b
    public ai.a bravo(Context context, Object obj) {
        switch (this.alpha) {
            case 1:
                String input = (String) obj;
                Intrinsics.echo(input, "input");
                return null;
            case 2:
                String[] input2 = (String[]) obj;
                Intrinsics.echo(input2, "input");
                return null;
            case 3:
                String[] input3 = (String[]) obj;
                Intrinsics.echo(input3, "input");
                if (input3.length == 0) {
                    return new ai.a(kotlin.collections.t.alpha);
                }
                for (String str : input3) {
                    if (AbstractC1735d.alpha(context, str) != 0) {
                        return null;
                    }
                }
                int quebec = kotlin.collections.y.quebec(input3.length);
                if (quebec < 16) {
                    quebec = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(quebec);
                for (String str2 : input3) {
                    Pair pair = new Pair(str2, Boolean.TRUE);
                    linkedHashMap.put(pair.getFirst(), pair.getSecond());
                }
                return new ai.a(linkedHashMap);
            case 4:
                String input4 = (String) obj;
                Intrinsics.echo(input4, "input");
                if (AbstractC1735d.alpha(context, input4) == 0) {
                    return new ai.a(Boolean.TRUE);
                }
                return null;
            case 5:
            case 6:
            default:
                return super.bravo(context, obj);
            case 7:
                Uri input5 = (Uri) obj;
                Intrinsics.echo(input5, "input");
                return null;
        }
    }

    @Override // ai.b
    public final Object charlie(Intent intent, int i4) {
        Object arrayList;
        boolean z2;
        boolean z10;
        switch (this.alpha) {
            case 0:
                Object obj = null;
                if (intent != null) {
                    Object parcelableExtra = intent.getParcelableExtra("CROP_IMAGE_EXTRA_RESULT");
                    if (parcelableExtra instanceof CropImage$ActivityResult) {
                        obj = parcelableExtra;
                    }
                    obj = (CropImage$ActivityResult) obj;
                }
                if (obj == null || i4 == 0) {
                    return n.f2616b;
                }
                return obj;
            case 1:
                if (i4 != -1) {
                    intent = null;
                }
                if (intent == null) {
                    return null;
                }
                return intent.getData();
            case 2:
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
            case 3:
                kotlin.collections.t tVar = kotlin.collections.t.alpha;
                if (i4 == -1 && intent != null) {
                    String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                    int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                    if (intArrayExtra != null && stringArrayExtra != null) {
                        ArrayList arrayList2 = new ArrayList(intArrayExtra.length);
                        for (int i10 : intArrayExtra) {
                            if (i10 == 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            arrayList2.add(Boolean.valueOf(z2));
                        }
                        return kotlin.collections.y.yankee(CollectionsKt.H(ArraysKt.filterNotNull(stringArrayExtra), arrayList2));
                    }
                    return tVar;
                }
                return tVar;
            case 4:
                if (intent != null && i4 == -1) {
                    int[] intArrayExtra2 = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                    boolean z11 = false;
                    if (intArrayExtra2 != null) {
                        int length = intArrayExtra2.length;
                        int i11 = 0;
                        while (true) {
                            if (i11 < length) {
                                if (intArrayExtra2[i11] == 0) {
                                    z11 = true;
                                } else {
                                    i11++;
                                }
                            }
                        }
                    }
                    return Boolean.valueOf(z11);
                }
                return Boolean.FALSE;
            case 5:
                return new ActivityResult(intent, i4);
            case 6:
                return new ActivityResult(intent, i4);
            case 7:
                if (i4 == -1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            default:
                return new ActivityResult(intent, i4);
        }
    }
}

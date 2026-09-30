package Wb;

import android.net.Uri;
import android.os.Bundle;
import androidx.core.content.FileProvider;
import androidx.lifecycle.T;
import delivery.samurai.android.R;
import delivery.samurai.android.ui.orders.note.ui.AddressNoteActivity;
import java.io.File;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import vf.ad;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements ah.a {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ AddressNoteActivity purple;

    public /* synthetic */ a(AddressNoteActivity addressNoteActivity, int i4) {
        this.alpha = i4;
        this.purple = addressNoteActivity;
    }

    public void alpha(Bundle bundle) {
        K9.b bVar;
        int i4;
        int i5 = AddressNoteActivity.f12347W;
        String string = bundle.getString("annotatedPath");
        if (string == null) {
            return;
        }
        AddressNoteActivity addressNoteActivity = this.purple;
        Vb.a aVar = (Vb.a) addressNoteActivity.ivory().foxtrot.getValue();
        if (aVar == null) {
            aVar = new Vb.a(null, null);
        }
        int i10 = addressNoteActivity.f12352L;
        K9.b[] values = K9.b.values();
        int length = values.length;
        int i11 = 0;
        while (true) {
            if (i11 < length) {
                bVar = values[i11];
                if (bVar.alpha == i10) {
                    break;
                } else {
                    i11++;
                }
            } else {
                bVar = null;
                break;
            }
        }
        if (bVar == null) {
            i4 = -1;
        } else {
            i4 = d.$EnumSwitchMapping$1[bVar.ordinal()];
        }
        if (i4 != 1) {
            if (i4 != 2) {
                String string2 = addressNoteActivity.getString(R.string.invalid_image_file);
                Intrinsics.delta(string2, "getString(...)");
                L9.d.pink(addressNoteActivity, string2);
            } else {
                addressNoteActivity.ivory().echo.setValue(Vb.a.alpha(aVar, null, new Pair(Integer.valueOf(addressNoteActivity.f12352L), string), 1));
            }
        } else {
            addressNoteActivity.ivory().echo.setValue(Vb.a.alpha(aVar, new Pair(Integer.valueOf(addressNoteActivity.f12352L), string), null, 2));
        }
        addressNoteActivity.lime(true);
    }

    @Override // ah.a
    public void charlie(Object obj) {
        AddressNoteActivity addressNoteActivity = this.purple;
        int i4 = this.alpha;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        switch (i4) {
            case 0:
                Uri uri = addressNoteActivity.f12357R;
                if (uri != null) {
                    if (!booleanValue) {
                        uri = null;
                    }
                    if (uri != null) {
                        if (!addressNoteActivity.isFinishing() && !addressNoteActivity.isDestroyed()) {
                            addressNoteActivity.lime(false);
                            ad.zulu(T.foxtrot(addressNoteActivity), null, null, new i(addressNoteActivity, uri, null), 3);
                            return;
                        }
                        return;
                    }
                }
                String string = addressNoteActivity.getString(R.string.camera_cancelled);
                Intrinsics.delta(string, "getString(...)");
                L9.d.pink(addressNoteActivity, string);
                return;
            default:
                int i5 = AddressNoteActivity.f12347W;
                if (booleanValue) {
                    try {
                        File file = new File(addressNoteActivity.getCacheDir(), "photo_" + System.currentTimeMillis() + ".jpg");
                        if (!file.exists()) {
                            file.createNewFile();
                        }
                        Uri uriForFile = FileProvider.getUriForFile(addressNoteActivity, addressNoteActivity.getPackageName() + ".provider", file);
                        addressNoteActivity.f12357R = uriForFile;
                        if (uriForFile != null) {
                            addressNoteActivity.f12360U.alpha(uriForFile);
                            return;
                        }
                        String string2 = addressNoteActivity.getString(R.string.unable_to_open_camera);
                        Intrinsics.delta(string2, "getString(...)");
                        L9.d.pink(addressNoteActivity, string2);
                        return;
                    } catch (Exception e) {
                        String localizedMessage = e.getLocalizedMessage();
                        if (localizedMessage == null) {
                            localizedMessage = addressNoteActivity.getString(R.string.error_something_went_wrong);
                            Intrinsics.delta(localizedMessage, "getString(...)");
                        }
                        String string3 = addressNoteActivity.getString(R.string.camera_error, localizedMessage);
                        Intrinsics.delta(string3, "getString(...)");
                        L9.d.pink(addressNoteActivity, string3);
                        return;
                    }
                }
                String string4 = addressNoteActivity.getString(R.string.permission_required_msg_camera);
                Intrinsics.delta(string4, "getString(...)");
                L9.d.pink(addressNoteActivity, string4);
                return;
        }
    }
}

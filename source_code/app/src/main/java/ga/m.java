package ga;

import B9.K;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.app.network.network.models.trophies.Trophy;
import com.app.network.network.response.DataResponse;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.imageview.ShapeableImageView;
import delivery.samurai.android.R;
import delivery.samurai.android.ui.about.MoreFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import r3.C2492a;

/* loaded from: classes2.dex */
public final /* synthetic */ class m implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ MoreFragment purple;

    public /* synthetic */ m(MoreFragment moreFragment, int i4) {
        this.alpha = i4;
        this.purple = moreFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i4;
        Integer num;
        int collectionSizeOrDefault;
        int i5;
        int i10;
        switch (this.alpha) {
            case 0:
                MoreFragment moreFragment = this.purple;
                String romeo = moreFragment.romeo();
                K sierra = moreFragment.sierra();
                if (romeo != null && !StringsKt.gray(romeo)) {
                    i4 = 0;
                } else {
                    i4 = 8;
                }
                ((MaterialButton) sierra.hotel).setVisibility(i4);
                return Unit.INSTANCE;
            default:
                C2492a c2492a = (C2492a) obj;
                List list = null;
                if (c2492a != null) {
                    num = Integer.valueOf(c2492a.alpha);
                } else {
                    num = null;
                }
                MoreFragment moreFragment2 = this.purple;
                if (num != null && num.intValue() == 2) {
                    moreFragment2.kilo().bronze();
                } else if (num != null && num.intValue() == 1) {
                    moreFragment2.kilo().tango();
                    DataResponse dataResponse = (DataResponse) c2492a.charlie;
                    if (dataResponse != null) {
                        list = dataResponse.getItems();
                    }
                    if (list == null) {
                        list = CollectionsKt.emptyList();
                    }
                    int i11 = 0;
                    if (!list.isEmpty()) {
                        ((ConstraintLayout) moreFragment2.sierra().oscar).setVisibility(0);
                    }
                    List r4 = CollectionsKt.r(list, 3);
                    collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(r4, 10);
                    ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
                    Iterator it = r4.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((Trophy) it.next()).localizedImage());
                    }
                    MoreFragment.quebec((ShapeableImageView) moreFragment2.sierra().papa, (String) CollectionsKt.jade(0, arrayList));
                    MoreFragment.quebec((ShapeableImageView) moreFragment2.sierra().quebec, (String) CollectionsKt.jade(1, arrayList));
                    MoreFragment.quebec((ShapeableImageView) moreFragment2.sierra().romeo, (String) CollectionsKt.jade(2, arrayList));
                    K sierra2 = moreFragment2.sierra();
                    CharSequence charSequence = (CharSequence) CollectionsKt.jade(0, arrayList);
                    if (charSequence != null && !StringsKt.gray(charSequence)) {
                        i5 = 0;
                    } else {
                        i5 = 8;
                    }
                    ((ShapeableImageView) sierra2.papa).setVisibility(i5);
                    K sierra3 = moreFragment2.sierra();
                    CharSequence charSequence2 = (CharSequence) CollectionsKt.jade(1, arrayList);
                    if (charSequence2 != null && !StringsKt.gray(charSequence2)) {
                        i10 = 0;
                    } else {
                        i10 = 8;
                    }
                    ((ShapeableImageView) sierra3.quebec).setVisibility(i10);
                    K sierra4 = moreFragment2.sierra();
                    CharSequence charSequence3 = (CharSequence) CollectionsKt.jade(2, arrayList);
                    if (charSequence3 == null || StringsKt.gray(charSequence3)) {
                        i11 = 8;
                    }
                    ((ShapeableImageView) sierra4.romeo).setVisibility(i11);
                } else if (num != null && num.intValue() == 0) {
                    moreFragment2.kilo().tango();
                    androidx.fragment.app.an requireActivity = moreFragment2.requireActivity();
                    Intrinsics.delta(requireActivity, "requireActivity(...)");
                    String str = c2492a.bravo;
                    if (str == null) {
                        str = moreFragment2.getString(R.string.error_something_went_wrong);
                        Intrinsics.delta(str, "getString(...)");
                    }
                    L9.d.pink(requireActivity, str);
                } else {
                    moreFragment2.kilo().tango();
                }
                return Unit.INSTANCE;
        }
    }
}

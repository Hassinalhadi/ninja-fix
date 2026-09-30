package ya;

import B9.C0058p;
import android.graphics.Typeface;
import android.widget.TextView;
import androidx.lifecycle.T;
import androidx.lifecycle.ae;
import androidx.lifecycle.ag;
import androidx.recyclerview.widget.RecyclerView;
import com.app.network.network.models.City;
import com.app.network.network.models.Country;
import com.app.network.network.models.PlatformListResponse;
import com.app.network.network.models.SignUpRequest;
import com.app.network.network.response.DataResponse;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import d3.k;
import delivery.samurai.android.ui.auth.signup.step1worksetup.StartWorkFragment;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import r3.C2492a;
import vf.ad;
import za.C3495d;

/* renamed from: ya.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3407c implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ StartWorkFragment purple;

    public /* synthetic */ C3407c(StartWorkFragment startWorkFragment, int i4) {
        this.alpha = i4;
        this.purple = startWorkFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Integer num;
        Integer num2;
        String str;
        int i4;
        List list;
        int i5;
        List list2;
        Integer num3;
        Integer num4;
        Integer num5;
        String str2;
        switch (this.alpha) {
            case 0:
                City it = (City) obj;
                Intrinsics.echo(it, "it");
                this.purple.tango(it);
                return Unit.INSTANCE;
            case 1:
                SignUpRequest request = (SignUpRequest) obj;
                Intrinsics.echo(request, "request");
                StartWorkFragment startWorkFragment = this.purple;
                City city = startWorkFragment.f12209i;
                Integer num6 = null;
                if (city != null) {
                    num = city.getId();
                } else {
                    num = null;
                }
                request.setCityId(num);
                Country country = startWorkFragment.f12208h;
                if (country != null) {
                    num2 = country.getId();
                } else {
                    num2 = null;
                }
                request.setCountryId(num2);
                Country country2 = startWorkFragment.f12208h;
                if (country2 != null) {
                    str = country2.getMobileCountryCode();
                } else {
                    str = null;
                }
                request.setMobileCountryCode(str);
                PlatformListResponse platformListResponse = startWorkFragment.f12210j;
                if (platformListResponse != null) {
                    num6 = platformListResponse.getId();
                }
                request.setPreferredPlatformId(num6);
                return Unit.INSTANCE;
            case 2:
                PlatformListResponse it2 = (PlatformListResponse) obj;
                Intrinsics.echo(it2, "it");
                this.purple.victor(it2);
                return Unit.INSTANCE;
            case 3:
                C2492a c2492a = (C2492a) obj;
                int i10 = c2492a.alpha;
                StartWorkFragment startWorkFragment2 = this.purple;
                if (i10 != 0) {
                    boolean z2 = true;
                    if (i10 != 1) {
                        if (i10 == 2) {
                            startWorkFragment2.kilo().bronze();
                        }
                    } else {
                        List list3 = (List) c2492a.charlie;
                        startWorkFragment2.f12212l.bravo(list3);
                        startWorkFragment2.f12207g = list3;
                        if (list3 != null) {
                            int i11 = 0;
                            if (list3.size() >= 5) {
                                z2 = false;
                            }
                            C0058p quebec = startWorkFragment2.quebec();
                            if (z2) {
                                i4 = 0;
                            } else {
                                i4 = 8;
                            }
                            ((RecyclerView) quebec.kilo).setVisibility(i4);
                            ((TextView) startWorkFragment2.quebec().delta).setVisibility(0);
                            C0058p quebec2 = startWorkFragment2.quebec();
                            if (z2) {
                                i11 = 8;
                            }
                            ((TextInputLayout) quebec2.india).setVisibility(i11);
                        }
                        startWorkFragment2.kilo().tango();
                    }
                } else {
                    startWorkFragment2.kilo().tango();
                    k kilo = startWorkFragment2.kilo();
                    String str3 = c2492a.bravo;
                    if (str3 == null) {
                        return Unit.INSTANCE;
                    }
                    L9.d.pink(kilo, str3);
                }
                return Unit.INSTANCE;
            case 4:
                C2492a c2492a2 = (C2492a) obj;
                int i12 = c2492a2.alpha;
                StartWorkFragment startWorkFragment3 = this.purple;
                if (i12 != 0) {
                    boolean z10 = true;
                    if (i12 != 1) {
                        if (i12 == 2 && ((list2 = startWorkFragment3.f12206f) == null || list2.isEmpty())) {
                            startWorkFragment3.kilo().bronze();
                        }
                    } else {
                        startWorkFragment3.kilo().tango();
                        DataResponse dataResponse = (DataResponse) c2492a2.charlie;
                        if (dataResponse != null) {
                            list = dataResponse.getItems();
                        } else {
                            list = null;
                        }
                        if (list == null) {
                            list = CollectionsKt.emptyList();
                        }
                        startWorkFragment3.f12206f = list;
                        C3495d c3495d = startWorkFragment3.f12211k;
                        ArrayList arrayList = c3495d.bravo;
                        arrayList.clear();
                        if (list != null && !list.isEmpty()) {
                            arrayList.addAll(list);
                        }
                        c3495d.notifyDataSetChanged();
                        ArrayList arrayList2 = c3495d.bravo;
                        arrayList2.clear();
                        if (list != null && !list.isEmpty()) {
                            arrayList2.addAll(list);
                        }
                        c3495d.notifyDataSetChanged();
                        if (list != null) {
                            int i13 = 0;
                            if (list.size() >= 5) {
                                z10 = false;
                            }
                            C0058p quebec3 = startWorkFragment3.quebec();
                            if (z10) {
                                i5 = 0;
                            } else {
                                i5 = 8;
                            }
                            ((RecyclerView) quebec3.juliet).setVisibility(i5);
                            C0058p quebec4 = startWorkFragment3.quebec();
                            if (z10) {
                                i13 = 8;
                            }
                            ((TextInputLayout) quebec4.hotel).setVisibility(i13);
                        }
                        ag foxtrot = T.foxtrot(startWorkFragment3);
                        ad.zulu(foxtrot, null, null, new ae(foxtrot, new g(startWorkFragment3, null), null), 3);
                    }
                } else {
                    startWorkFragment3.kilo().tango();
                    k kilo2 = startWorkFragment3.kilo();
                    String str4 = c2492a2.bravo;
                    if (str4 == null) {
                        return Unit.INSTANCE;
                    }
                    L9.d.pink(kilo2, str4);
                }
                return Unit.INSTANCE;
            case 5:
                Country it3 = (Country) obj;
                Intrinsics.echo(it3, "it");
                Integer id2 = it3.getId();
                StartWorkFragment startWorkFragment4 = this.purple;
                Country country3 = startWorkFragment4.f12208h;
                if (country3 != null) {
                    num3 = country3.getId();
                } else {
                    num3 = null;
                }
                if (!Intrinsics.areEqual(id2, num3)) {
                    startWorkFragment4.uniform(it3);
                    C0058p quebec5 = startWorkFragment4.quebec();
                    String localizedName = it3.getLocalizedName();
                    TextInputEditText textInputEditText = (TextInputEditText) quebec5.foxtrot;
                    textInputEditText.setText(localizedName);
                    textInputEditText.setTypeface(Typeface.defaultFromStyle(1));
                }
                return Unit.INSTANCE;
            default:
                SignUpRequest signUpRequest = (SignUpRequest) obj;
                Intrinsics.echo(signUpRequest, "signUpRequest");
                StartWorkFragment startWorkFragment5 = this.purple;
                City city2 = startWorkFragment5.f12209i;
                Integer num7 = null;
                if (city2 != null) {
                    num4 = city2.getId();
                } else {
                    num4 = null;
                }
                signUpRequest.setCityId(num4);
                Country country4 = startWorkFragment5.f12208h;
                if (country4 != null) {
                    num5 = country4.getId();
                } else {
                    num5 = null;
                }
                signUpRequest.setCountryId(num5);
                Country country5 = startWorkFragment5.f12208h;
                if (country5 != null) {
                    str2 = country5.getMobileCountryCode();
                } else {
                    str2 = null;
                }
                signUpRequest.setMobileCountryCode(str2);
                PlatformListResponse platformListResponse2 = startWorkFragment5.f12210j;
                if (platformListResponse2 != null) {
                    num7 = platformListResponse2.getId();
                }
                signUpRequest.setPreferredPlatformId(num7);
                return Unit.INSTANCE;
        }
    }
}

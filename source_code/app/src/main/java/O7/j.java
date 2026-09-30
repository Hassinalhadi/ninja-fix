package O7;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.hardware.camera2.CameraDevice;
import android.os.Build;
import android.os.Handler;
import android.os.Parcel;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.autofill.AutofillManager;
import androidx.appcompat.app.ak;
import androidx.appcompat.widget.P0;
import androidx.camera.core.ar;
import androidx.compose.runtime.AbstractC0587t;
import androidx.fragment.app.an;
import androidx.lifecycle.T;
import be.InterfaceC0757c;
import bv.ac;
import coil.memory.MemoryCache$Key;
import com.app.network.network.models.City;
import com.app.network.network.models.Country;
import com.app.network.network.models.Order;
import com.app.network.network.models.WithdrawTransaction;
import com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import delivery.samurai.android.R;
import delivery.samurai.android.ui.orders.OrderHistoryFragment;
import delivery.samurai.android.ui.tickets.presentation.ticketslist.TicketsFragment;
import delivery.samurai.android.ui.tickets.presentation.ticketslist.TicketsViewModel;
import delivery.samurai.android.ui.transfer.TransferCardListActivity;
import delivery.samurai.android.ui.withdraw.WithDrawHistoryFragment;
import delivery.samurai.android.ui.withdraw.WithdrawDetailActivity;
import g3.EnumC1747h;
import j9.InterfaceC1954a;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeoutException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import m6.AbstractC2101b;
import org.w3c.dom.Node;
import pe.InterfaceC2330f;
import pe.InterfaceC2332h;
import s6.E6;
import s6.S6;
import s6.V4;
import t6.AbstractC3001h2;
import t6.Z2;
import vf.ad;
import w3.AbstractC3236a;
import x9.InterfaceC3312f;
import xe.EnumC3339b;
import yf.N;

/* loaded from: classes2.dex */
public class j implements G6.g, InterfaceC3312f, InterfaceC1954a, OnSuccessListener, T5.m, ao.j, InterfaceC0757c {
    public final /* synthetic */ int alpha;
    public final Object purple;

    public /* synthetic */ j(int i4, Object obj) {
        this.alpha = i4;
        this.purple = obj;
    }

    public static X2.m golf(S2.l lVar, X2.h hVar, MemoryCache$Key memoryCache$Key, V2.a aVar) {
        String str;
        boolean z2;
        BitmapDrawable bitmapDrawable = new BitmapDrawable(hVar.alpha.getResources(), aVar.alpha);
        O2.f fVar = O2.f.alpha;
        Map map = aVar.bravo;
        Object obj = map.get("coil#disk_cache_key");
        Boolean bool = null;
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        Object obj2 = map.get("coil#is_sampled");
        if (obj2 instanceof Boolean) {
            bool = (Boolean) obj2;
        }
        boolean z10 = false;
        if (bool != null) {
            z2 = bool.booleanValue();
        } else {
            z2 = false;
        }
        Bitmap.Config[] configArr = a3.h.alpha;
        if (lVar != null && lVar.purple) {
            z10 = true;
        }
        return new X2.m(bitmapDrawable, hVar, fVar, memoryCache$Key, str, z2, z10);
    }

    private final void india(Throwable th) {
    }

    @Override // T5.m
    public void accept(Object obj, Object obj2) {
        Z5.e eVar = new Z5.e(0, (G6.h) obj2);
        Z5.d dVar = (Z5.d) ((Z5.g) obj).tango();
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(dVar.india);
        AbstractC2101b.delta(obtain, eVar);
        AbstractC2101b.charlie(obtain, (ApiFeatureRequest) this.purple);
        dVar.bravo(obtain, 1);
    }

    public void alpha() {
        ((AbstractC0587t) this.purple).getClass();
        Intrinsics.areEqual(null, null);
    }

    @Override // be.InterfaceC0757c
    public void b(Throwable th) {
        switch (this.alpha) {
            case 26:
                ((ar) this.purple).close();
                return;
            case 27:
                return;
            default:
                boolean z2 = th instanceof TimeoutException;
                V0.h hVar = (V0.h) this.purple;
                if (z2) {
                    hVar.delta(th);
                    return;
                } else {
                    hVar.bravo(Collections.EMPTY_LIST);
                    return;
                }
        }
    }

    @Override // x9.InterfaceC3312f
    public void black(View view, int i4, Object obj) {
        Object obj2 = this.purple;
        switch (this.alpha) {
            case 4:
                Order item = (Order) obj;
                Intrinsics.echo(item, "item");
                Intrinsics.echo(view, "view");
                Integer id2 = item.getId();
                if (id2 != null) {
                    Qb.p pVar = new Qb.p();
                    pVar.setArguments(S6.charlie(new Pair("orderId", id2)));
                    pVar.romeo(((OrderHistoryFragment) obj2).getParentFragmentManager(), "");
                    return;
                }
                return;
            case 13:
                City item2 = (City) obj;
                Intrinsics.echo(item2, "item");
                Intrinsics.echo(view, "view");
                Wa.b bVar = (Wa.b) obj2;
                wa.i iVar = bVar.f2204w;
                if (iVar != null) {
                    iVar.invoke(item2);
                }
                bVar.juliet();
                return;
            case 14:
                WithdrawTransaction item3 = (WithdrawTransaction) obj;
                Intrinsics.echo(item3, "item");
                Intrinsics.echo(view, "view");
                WithDrawHistoryFragment withDrawHistoryFragment = (WithDrawHistoryFragment) obj2;
                an activity = withDrawHistoryFragment.getActivity();
                if (activity != null) {
                    int i5 = WithdrawDetailActivity.f12546N;
                    Intent intent = new Intent(withDrawHistoryFragment.getContext(), (Class<?>) WithdrawDetailActivity.class);
                    intent.putExtra("withdraw_HISTORY", item3);
                    AbstractC3236a.alpha(activity, intent, new android.util.Pair(view, withDrawHistoryFragment.getString(R.string.anim_root)), new android.util.Pair(view, withDrawHistoryFragment.getString(R.string.anim_name_order_view)));
                    return;
                }
                return;
            default:
                Country item4 = (Country) obj;
                Intrinsics.echo(item4, "item");
                Intrinsics.echo(view, "view");
                Xa.g gVar = (Xa.g) obj2;
                Function1 function1 = gVar.f2247x;
                if (function1 != null) {
                    function1.invoke(item4);
                }
                gVar.juliet();
                return;
        }
    }

    public void bravo(Oe.e eVar) {
        if (eVar.kilo()) {
            int size = eVar.size();
            int[] iArr = Oe.aa.f1881a;
            int binarySearch = Arrays.binarySearch(iArr, size);
            if (binarySearch < 0) {
                binarySearch = (-(binarySearch + 1)) - 1;
            }
            int i4 = iArr[binarySearch + 1];
            Stack stack = (Stack) this.purple;
            if (!stack.isEmpty() && ((Oe.e) stack.peek()).size() < i4) {
                int i5 = iArr[binarySearch];
                Oe.e eVar2 = (Oe.e) stack.pop();
                while (!stack.isEmpty() && ((Oe.e) stack.peek()).size() < i5) {
                    eVar2 = new Oe.aa((Oe.e) stack.pop(), eVar2);
                }
                Oe.aa aaVar = new Oe.aa(eVar2, eVar);
                while (!stack.isEmpty()) {
                    int[] iArr2 = Oe.aa.f1881a;
                    int binarySearch2 = Arrays.binarySearch(iArr2, aaVar.purple);
                    if (binarySearch2 < 0) {
                        binarySearch2 = (-(binarySearch2 + 1)) - 1;
                    }
                    if (((Oe.e) stack.peek()).size() >= iArr2[binarySearch2 + 1]) {
                        break;
                    } else {
                        aaVar = new Oe.aa((Oe.e) stack.pop(), aaVar);
                    }
                }
                stack.push(aaVar);
                return;
            }
            stack.push(eVar);
            return;
        }
        if (eVar instanceof Oe.aa) {
            Oe.aa aaVar2 = (Oe.aa) eVar;
            bravo(aaVar2.red);
            bravo(aaVar2.silver);
            return;
        }
        String valueOf = String.valueOf(eVar.getClass());
        throw new IllegalArgumentException(P0.gold(new StringBuilder(valueOf.length() + 49), "Has a new type of ByteString been created? Found ", valueOf));
    }

    public Object charlie(SerialDescriptor descriptor, Pf.s sVar) {
        Object obj;
        Intrinsics.echo(descriptor, "descriptor");
        Map map = (Map) ((ConcurrentHashMap) this.purple).get(descriptor);
        if (map != null) {
            obj = map.get(sVar);
        } else {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        return obj;
    }

    @Override // ao.j
    public void coral(ao.l lVar) {
        ak akVar = (ak) this.purple;
        boolean oscar = akVar.alpha.alpha.oscar();
        androidx.appcompat.app.w wVar = akVar.bravo;
        if (oscar) {
            wVar.onPanelClosed(108, lVar);
        } else if (wVar.onPreparePanel(0, null, lVar)) {
            wVar.onMenuOpened(108, lVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00b6, code lost:
    
        if (r7 != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x014c, code lost:
    
        if (r0 != false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0153, code lost:
    
        if (r7 == false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0138, code lost:
    
        if (java.lang.Math.abs(r10 - r1) <= 1) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0144, code lost:
    
        if (java.lang.Math.abs(r2 - r5) > r9) goto L96;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x015a A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public V2.a delta(X2.h hVar, MemoryCache$Key memoryCache$Key, Y2.h hVar2, Y2.g gVar) {
        V2.a aVar;
        boolean z2;
        Boolean bool;
        boolean z10;
        int i4;
        int i5;
        int i10;
        double d4;
        int i11;
        V2.a aVar2;
        V2.a aVar3;
        if (hVar.november.alpha) {
            V2.b bVar = (V2.b) ((M2.k) this.purple).charlie.getValue();
            if (bVar != null) {
                aVar = bVar.alpha.lavender(memoryCache$Key);
                if (aVar == null) {
                    Fe.c cVar = bVar.bravo;
                    synchronized (cVar) {
                        try {
                            ArrayList arrayList = (ArrayList) ((LinkedHashMap) cVar.red).get(memoryCache$Key);
                            aVar2 = null;
                            if (arrayList != null) {
                                int size = arrayList.size();
                                int i12 = 0;
                                while (true) {
                                    if (i12 >= size) {
                                        break;
                                    }
                                    V2.e eVar = (V2.e) arrayList.get(i12);
                                    Bitmap bitmap = (Bitmap) eVar.bravo.get();
                                    if (bitmap != null) {
                                        aVar3 = new V2.a(bitmap, eVar.charlie);
                                    } else {
                                        aVar3 = null;
                                    }
                                    if (aVar3 != null) {
                                        aVar2 = aVar3;
                                        break;
                                    }
                                    i12++;
                                }
                                int i13 = cVar.purple;
                                cVar.purple = i13 + 1;
                                if (i13 >= 10) {
                                    cVar.delta();
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    aVar = aVar2;
                }
            } else {
                aVar = null;
            }
            if (aVar != null) {
                Bitmap bitmap2 = aVar.alpha;
                Bitmap.Config config = bitmap2.getConfig();
                if (config == null) {
                    config = Bitmap.Config.ARGB_8888;
                }
                if (Z2.charlie(config) && !hVar.kilo) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (z2) {
                    Object obj = aVar.bravo.get("coil#is_sampled");
                    if (obj instanceof Boolean) {
                        bool = (Boolean) obj;
                    } else {
                        bool = null;
                    }
                    if (bool != null) {
                        z10 = bool.booleanValue();
                    } else {
                        z10 = false;
                    }
                    if (!Intrinsics.areEqual(hVar2, Y2.h.charlie)) {
                        String str = (String) memoryCache$Key.purple.get("coil#transformation_size");
                        if (str != null) {
                            i11 = Intrinsics.areEqual(str, hVar2.toString());
                            if (i11 != 0) {
                                return aVar;
                            }
                        } else {
                            int width = bitmap2.getWidth();
                            int height = bitmap2.getHeight();
                            AbstractC3001h2 abstractC3001h2 = hVar2.alpha;
                            if (abstractC3001h2 instanceof Y2.a) {
                                i4 = ((Y2.a) abstractC3001h2).alpha;
                            } else {
                                i4 = Integer.MAX_VALUE;
                            }
                            AbstractC3001h2 abstractC3001h22 = hVar2.bravo;
                            if (abstractC3001h22 instanceof Y2.a) {
                                i5 = ((Y2.a) abstractC3001h22).alpha;
                            } else {
                                i5 = Integer.MAX_VALUE;
                            }
                            double bravo = E6.bravo(width, height, i4, i5, gVar);
                            boolean alpha = a3.f.alpha(hVar);
                            if (alpha) {
                                if (bravo > 1.0d) {
                                    d4 = 1.0d;
                                } else {
                                    d4 = bravo;
                                }
                                if (Math.abs(i4 - (width * d4)) > 1.0d && Math.abs(i5 - (d4 * height)) > 1.0d) {
                                    i10 = 1;
                                }
                                i10 = 1;
                                i11 = i10;
                                if (i11 != 0) {
                                }
                            } else {
                                if (i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE) {
                                    i10 = 1;
                                } else {
                                    i10 = 1;
                                }
                                if (i5 != Integer.MIN_VALUE) {
                                    if (i5 != Integer.MAX_VALUE) {
                                    }
                                }
                                i11 = i10;
                                if (i11 != 0) {
                                }
                            }
                            if (bravo != 1.0d) {
                            }
                            if (bravo > 1.0d) {
                            }
                            i11 = i10;
                            if (i11 != 0) {
                            }
                        }
                    }
                }
                i11 = 0;
                if (i11 != 0) {
                }
            }
        }
        return null;
    }

    public V9.d echo(g3.s result, EnumC1747h enumC1747h) {
        String str;
        String string;
        String string2;
        Intrinsics.echo(result, "result");
        boolean z2 = result instanceof g3.m;
        Integer valueOf = Integer.valueOf(R.color.grey_700);
        Activity activity = (Activity) this.purple;
        if (z2) {
            String magenta = ArraysKt.magenta(((g3.m) result).alpha, ", ", null, null, null, 62);
            int ordinal = enumC1747h.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        String string3 = activity.getString(R.string.location_permission_required_title);
                        Intrinsics.delta(string3, "getString(...)");
                        String string4 = activity.getString(R.string.missing_permissions_message, magenta);
                        Intrinsics.delta(string4, "getString(...)");
                        String string5 = activity.getString(R.string.grant_permission);
                        Intrinsics.delta(string5, "getString(...)");
                        return new V9.d(string3, string4, string5, null, R.drawable.bg_gradient_location_info, R.color.location_info_blue_dark, R.color.location_info_blue, null);
                    }
                    throw new NoWhenBranchMatchedException();
                }
                String string6 = activity.getString(R.string.location_permission_required_title);
                Intrinsics.delta(string6, "getString(...)");
                String string7 = activity.getString(R.string.missing_permissions_message, magenta);
                Intrinsics.delta(string7, "getString(...)");
                String string8 = activity.getString(R.string.grant_permission);
                Intrinsics.delta(string8, "getString(...)");
                return new V9.d(string6, string7, string8, activity.getString(R.string.later), R.drawable.bg_gradient_location_warning, R.color.location_warning_yellow_dark, R.color.location_warning_yellow, valueOf);
            }
            String string9 = activity.getString(R.string.location_permission_required_title);
            Intrinsics.delta(string9, "getString(...)");
            String string10 = activity.getString(R.string.missing_permissions_message, magenta);
            Intrinsics.delta(string10, "getString(...)");
            String string11 = activity.getString(R.string.grant_permission);
            Intrinsics.delta(string11, "getString(...)");
            return new V9.d(string9, string10, string11, null, R.drawable.bg_gradient_location_error, R.color.location_error_red_dark, R.color.location_error_red, null);
        }
        if (result instanceof g3.n) {
            int ordinal2 = L9.d.november(activity).ordinal();
            if (ordinal2 != 1) {
                if (ordinal2 != 2) {
                    if (ordinal2 != 3) {
                        string = activity.getString(R.string.while_using_app_text);
                    } else {
                        string = activity.getString(R.string.denied_text);
                    }
                } else {
                    string = activity.getString(R.string.ask_every_time_text);
                }
            } else {
                string = activity.getString(R.string.while_using_app_text);
            }
            Intrinsics.checkNotNull(string);
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 31) {
                string2 = activity.getString(R.string.background_location_steps_android12);
            } else if (i4 >= 29) {
                string2 = activity.getString(R.string.background_location_steps_android10);
            } else {
                string2 = activity.getString(R.string.background_location_steps_android9);
            }
            Intrinsics.checkNotNull(string2);
            String string12 = activity.getString(R.string.background_location_downgraded_message, string, string2);
            Intrinsics.delta(string12, "getString(...)");
            int ordinal3 = enumC1747h.ordinal();
            if (ordinal3 != 0) {
                if (ordinal3 != 1) {
                    if (ordinal3 == 2) {
                        String string13 = activity.getString(R.string.background_location_downgraded_title);
                        Intrinsics.delta(string13, "getString(...)");
                        String string14 = activity.getString(R.string.open_settings);
                        Intrinsics.delta(string14, "getString(...)");
                        return new V9.d(string13, string12, string14, null, R.drawable.bg_gradient_location_info, R.color.location_info_blue_dark, R.color.location_info_blue, null);
                    }
                    throw new NoWhenBranchMatchedException();
                }
                String string15 = activity.getString(R.string.background_location_downgraded_title);
                Intrinsics.delta(string15, "getString(...)");
                String string16 = activity.getString(R.string.open_settings);
                Intrinsics.delta(string16, "getString(...)");
                return new V9.d(string15, string12, string16, activity.getString(R.string.later), R.drawable.bg_gradient_location_warning, R.color.location_warning_yellow_dark, R.color.location_warning_yellow, valueOf);
            }
            String string17 = activity.getString(R.string.background_location_downgraded_title);
            Intrinsics.delta(string17, "getString(...)");
            String string18 = activity.getString(R.string.open_settings);
            Intrinsics.delta(string18, "getString(...)");
            return new V9.d(string17, string12, string18, null, R.drawable.bg_gradient_location_error, R.color.location_error_red_dark, R.color.location_error_red, null);
        }
        if (result instanceof g3.o) {
            int i5 = V9.e.$EnumSwitchMapping$0[enumC1747h.ordinal()];
            if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 == 3) {
                        String string19 = activity.getString(R.string.dialog_system_location_disabled_title);
                        Intrinsics.delta(string19, "getString(...)");
                        String string20 = activity.getString(R.string.dialog_system_location_disabled_message);
                        Intrinsics.delta(string20, "getString(...)");
                        String string21 = activity.getString(R.string.open_settings);
                        Intrinsics.delta(string21, "getString(...)");
                        return new V9.d(string19, string20, string21, null, R.drawable.bg_gradient_location_info, R.color.location_info_blue_dark, R.color.location_info_blue, null);
                    }
                    throw new NoWhenBranchMatchedException();
                }
                String string22 = activity.getString(R.string.dialog_system_location_disabled_title);
                Intrinsics.delta(string22, "getString(...)");
                String string23 = activity.getString(R.string.dialog_system_location_disabled_message);
                Intrinsics.delta(string23, "getString(...)");
                String string24 = activity.getString(R.string.open_settings);
                Intrinsics.delta(string24, "getString(...)");
                return new V9.d(string22, string23, string24, activity.getString(R.string.later), R.drawable.bg_gradient_location_warning, R.color.location_warning_yellow_dark, R.color.location_warning_yellow, valueOf);
            }
            String string25 = activity.getString(R.string.dialog_system_location_disabled_title);
            Intrinsics.delta(string25, "getString(...)");
            String string26 = activity.getString(R.string.dialog_system_location_disabled_message);
            Intrinsics.delta(string26, "getString(...)");
            String string27 = activity.getString(R.string.open_settings);
            Intrinsics.delta(string27, "getString(...)");
            return new V9.d(string25, string26, string27, null, R.drawable.bg_gradient_location_error, R.color.location_error_red_dark, R.color.location_error_red, null);
        }
        if (result instanceof g3.p) {
            int i10 = V9.e.$EnumSwitchMapping$0[enumC1747h.ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        String string28 = activity.getString(R.string.location_accuracy_recommended_title);
                        Intrinsics.delta(string28, "getString(...)");
                        String string29 = activity.getString(R.string.location_accuracy_recommended_message);
                        Intrinsics.delta(string29, "getString(...)");
                        String string30 = activity.getString(R.string.enable_high_accuracy);
                        Intrinsics.delta(string30, "getString(...)");
                        return new V9.d(string28, string29, string30, null, R.drawable.bg_gradient_location_info, R.color.location_info_blue_dark, R.color.location_info_blue, null);
                    }
                    throw new NoWhenBranchMatchedException();
                }
                String string31 = activity.getString(R.string.location_accuracy_recommended_title);
                Intrinsics.delta(string31, "getString(...)");
                String string32 = activity.getString(R.string.location_accuracy_recommended_message);
                Intrinsics.delta(string32, "getString(...)");
                String string33 = activity.getString(R.string.enable_high_accuracy);
                Intrinsics.delta(string33, "getString(...)");
                return new V9.d(string31, string32, string33, activity.getString(R.string.later), R.drawable.bg_gradient_location_warning, R.color.location_warning_yellow_dark, R.color.location_warning_yellow, valueOf);
            }
            String string34 = activity.getString(R.string.location_accuracy_required_title);
            Intrinsics.delta(string34, "getString(...)");
            String string35 = activity.getString(R.string.location_accuracy_required_message);
            Intrinsics.delta(string35, "getString(...)");
            String string36 = activity.getString(R.string.enable_high_accuracy);
            Intrinsics.delta(string36, "getString(...)");
            return new V9.d(string34, string35, string36, null, R.drawable.bg_gradient_location_error, R.color.location_error_red_dark, R.color.location_error_red, null);
        }
        if (result instanceof g3.r) {
            String string37 = activity.getString(R.string.location_unavailable_title);
            Intrinsics.delta(string37, "getString(...)");
            String string38 = activity.getString(android.R.string.ok);
            Intrinsics.delta(string38, "getString(...)");
            return new V9.d(string37, ((g3.r) result).alpha, string38, null, R.drawable.bg_gradient_location_info, R.color.location_info_blue_dark, R.color.location_info_blue, null);
        }
        if (result instanceof g3.q) {
            String string39 = activity.getString(R.string.location_permission_required_title);
            Intrinsics.delta(string39, "getString(...)");
            String string40 = activity.getString(R.string.location_permission_required_message);
            Intrinsics.delta(string40, "getString(...)");
            String string41 = activity.getString(R.string.open_settings);
            Intrinsics.delta(string41, "getString(...)");
            if (enumC1747h == EnumC1747h.purple) {
                str = activity.getString(R.string.later);
            } else {
                str = null;
            }
            return new V9.d(string39, string40, string41, str, R.drawable.bg_gradient_location_info, R.color.location_info_blue_dark, R.color.location_info_blue, valueOf);
        }
        throw new NoWhenBranchMatchedException();
    }

    public MemoryCache$Key foxtrot(X2.h hVar, Object obj, X2.k kVar, M2.c cVar) {
        String str;
        Map linkedHashMap;
        hVar.getClass();
        List list = ((M2.k) this.purple).hotel.charlie;
        int size = list.size();
        int i4 = 0;
        while (true) {
            if (i4 < size) {
                Pair pair = (Pair) list.get(i4);
                T2.b bVar = (T2.b) pair.first;
                if (((Class) pair.second).isAssignableFrom(obj.getClass())) {
                    Intrinsics.charlie(bVar, "null cannot be cast to non-null type coil.key.Keyer<kotlin.Any>");
                    str = bVar.alpha(obj, kVar);
                    if (str != null) {
                        break;
                    }
                }
                i4++;
            } else {
                str = null;
                break;
            }
        }
        if (str == null) {
            return null;
        }
        Map map = hVar.xray.alpha;
        boolean isEmpty = map.isEmpty();
        kotlin.collections.t tVar = kotlin.collections.t.alpha;
        if (isEmpty) {
            linkedHashMap = tVar;
        } else {
            linkedHashMap = new LinkedHashMap();
            Iterator it = map.entrySet().iterator();
            if (it.hasNext()) {
                ((Map.Entry) it.next()).getValue().getClass();
                throw new ClassCastException();
            }
        }
        List list2 = hVar.foxtrot;
        if (list2.isEmpty() && linkedHashMap.isEmpty()) {
            return new MemoryCache$Key(str, tVar);
        }
        LinkedHashMap amber = kotlin.collections.y.amber(linkedHashMap);
        if (!list2.isEmpty()) {
            if (list2.size() <= 0) {
                amber.put("coil#transformation_size", kVar.delta.toString());
            } else {
                list2.get(0).getClass();
                throw new ClassCastException();
            }
        }
        return new MemoryCache$Key(str, amber);
    }

    @Override // j9.InterfaceC1954a
    public boolean gray() {
        switch (this.alpha) {
            case 5:
                return ((Qc.k) ((TicketsFragment) this.purple).romeo().delta.getValue()).bravo;
            default:
                return ((TransferCardListActivity) this.purple).f12532K;
        }
    }

    public void hotel(View view, int i4, boolean z2) {
        if (Build.VERSION.SDK_INT >= 27) {
            ((AutofillManager) this.purple).notifyViewVisibilityChanged(view, i4, z2);
        }
    }

    @Override // j9.InterfaceC1954a
    public boolean isLoading() {
        switch (this.alpha) {
            case 5:
                return ((Qc.k) ((TicketsFragment) this.purple).romeo().delta.getValue()).charlie;
            default:
                return ((TransferCardListActivity) this.purple).gray().delta.red;
        }
    }

    public synchronized void juliet(D3.c cVar) {
        cVar.bravo = null;
        cVar.charlie = null;
        ((ArrayDeque) this.purple).offer(cVar);
    }

    public InterfaceC2330f kilo(ve.q javaClass) {
        ve.q qVar;
        Xe.n nVar;
        InterfaceC2332h interfaceC2332h;
        Intrinsics.echo(javaClass, "javaClass");
        Ne.c charlie = javaClass.charlie();
        Class cls = javaClass.alpha;
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass != null) {
            qVar = new ve.q(declaringClass);
        } else {
            qVar = null;
        }
        if (qVar != null) {
            InterfaceC2330f kilo = kilo(qVar);
            if (kilo != null) {
                nVar = kilo.s();
            } else {
                nVar = null;
            }
            if (nVar != null) {
                interfaceC2332h = nVar.golf(Ne.f.echo(cls.getSimpleName()), EnumC3339b.f14130a);
            } else {
                interfaceC2332h = null;
            }
            if (interfaceC2332h instanceof InterfaceC2330f) {
                return (InterfaceC2330f) interfaceC2332h;
            }
        } else {
            Ne.c echo = charlie.echo();
            Intrinsics.delta(echo, "fqName.parent()");
            Ce.r rVar = (Ce.r) CollectionsKt.green(CollectionsKt.orange(((Be.d) this.purple).charlie(echo)));
            if (rVar != null) {
                Ce.w wVar = rVar.f925d.delta;
                wVar.getClass();
                return wVar.victor(Ne.f.echo(cls.getSimpleName()), javaClass);
            }
        }
        return null;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener, com.clevertap.android.sdk.task.OnSuccessListener
    public void onSuccess(Object obj) {
        switch (this.alpha) {
            case 16:
                ((Function1) this.purple).invoke(obj);
                return;
            case 26:
                return;
            case 27:
                ((bj.f) this.purple).run();
                return;
            default:
                List list = (List) obj;
                list.getClass();
                ((V0.h) this.purple).bravo(new ArrayList(list));
                return;
        }
    }

    @Override // ao.j
    public boolean sierra(ao.l lVar, MenuItem menuItem) {
        return false;
    }

    @Override // G6.g
    public Task then(Object obj) {
        if (((W7.b) obj) == null) {
            Log.w("FirebaseCrashlytics", "Received null app settings, cannot send reports at crash time.", null);
            return V4.echo(null);
        }
        n nVar = ((k) this.purple).teal;
        return V4.foxtrot(Arrays.asList(n.alpha(nVar), nVar.mike.golf(nVar.echo.alpha, null)));
    }

    @Override // j9.InterfaceC1954a
    public void whiskey() {
        switch (this.alpha) {
            case 5:
                TicketsViewModel romeo = ((TicketsFragment) this.purple).romeo();
                N n5 = romeo.delta;
                Qc.k kVar = (Qc.k) n5.getValue();
                if (!kVar.charlie && !kVar.bravo) {
                    n5.juliet(null, Qc.k.alpha(kVar, true));
                    ad.zulu(T.hotel(romeo), null, null, new Qc.m(romeo, kVar.alpha + 1, null), 3);
                    return;
                }
                return;
            default:
                TransferCardListActivity transferCardListActivity = (TransferCardListActivity) this.purple;
                transferCardListActivity.f12531J++;
                transferCardListActivity.gray().delta.setRefreshing(true);
                transferCardListActivity.gold();
                return;
        }
    }

    public /* synthetic */ j(int i4, Object obj, Object obj2) {
        this.alpha = i4;
        this.purple = obj;
    }

    public /* synthetic */ j(Z5.f fVar, ApiFeatureRequest apiFeatureRequest) {
        this.alpha = 18;
        this.purple = apiFeatureRequest;
    }

    public j(Node n5) {
        this.alpha = 19;
        Intrinsics.echo(n5, "n");
        this.purple = n5;
    }

    public j(CameraDevice cameraDevice, Handler handler) {
        this.alpha = 24;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 28) {
            cameraDevice.getClass();
            this.purple = new w.o(cameraDevice, (B2.b) null);
        } else if (i4 >= 24) {
            this.purple = new w.o(cameraDevice, new B2.b(handler));
        } else {
            this.purple = new w.o(cameraDevice, new B2.b(handler));
        }
    }

    public j(long[] jArr) {
        ac acVar;
        this.alpha = 6;
        if (jArr != null) {
            long[] copyOf = Arrays.copyOf(jArr, jArr.length);
            acVar = new ac(copyOf.length);
            int i4 = acVar.bravo;
            if (i4 >= 0) {
                if (copyOf.length != 0) {
                    int length = copyOf.length + i4;
                    long[] jArr2 = acVar.alpha;
                    if (jArr2.length < length) {
                        long[] copyOf2 = Arrays.copyOf(jArr2, Math.max(length, (jArr2.length * 3) / 2));
                        Intrinsics.delta(copyOf2, "copyOf(...)");
                        acVar.alpha = copyOf2;
                    }
                    long[] jArr3 = acVar.alpha;
                    int i5 = acVar.bravo;
                    if (i4 != i5) {
                        ArraysKt.azure(jArr3, jArr3, copyOf.length + i4, i4, i5);
                    }
                    ArraysKt.azure(copyOf, jArr3, i4, 0, copyOf.length);
                    acVar.bravo += copyOf.length;
                }
            } else {
                bw.a.delta("");
                throw null;
            }
        } else {
            acVar = new ac(16);
        }
        this.purple = acVar;
    }

    public j(int i4) {
        this.alpha = i4;
        switch (i4) {
            case 2:
                char[] cArr = Y3.l.alpha;
                this.purple = new ArrayDeque(0);
                return;
            case 3:
                this.purple = new ConcurrentHashMap(16);
                return;
            default:
                this.purple = new Stack();
                return;
        }
    }
}

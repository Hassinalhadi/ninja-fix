package Sc;

import B9.N;
import B9.O;
import Sc.p;
import android.content.Context;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.StrictMode;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.f0;
import com.app.network.network.models.AddressNoteListItem;
import com.app.network.network.models.Attachment;
import com.app.network.network.models.TransferCard;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import delivery.samurai.android.R;
import h6.AbstractC1811a;
import h6.InterfaceC1813c;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import q6.w;
import s1.C2576i;
import s6.AbstractC2670h5;
import t6.AbstractC2997g3;
import t6.U2;
import x6.k;
import x6.r;
import x6.s;
import x6.v;
import x9.AbstractC3311e;

/* loaded from: classes2.dex */
public final class p extends AbstractC3311e {
    public final /* synthetic */ int charlie;
    public Object delta;
    public Xd.l echo;

    public p(int i4) {
        this.charlie = i4;
        switch (i4) {
            case 1:
                this.delta = new ArrayList();
                return;
            default:
                return;
        }
    }

    @Override // x9.AbstractC3311e, androidx.recyclerview.widget.az
    public int getItemCount() {
        switch (this.charlie) {
            case 1:
                return ((ArrayList) this.delta).size();
            default:
                return super.getItemCount();
        }
    }

    @Override // androidx.recyclerview.widget.az
    public final void onBindViewHolder(f0 f0Var, int i4) {
        String str = null;
        final int i5 = 1;
        final int i10 = 0;
        switch (this.charlie) {
            case 0:
                o holder = (o) f0Var;
                Intrinsics.echo(holder, "holder");
                Object obj = this.alpha.get(i4);
                Intrinsics.delta(obj, "get(...)");
                TransferCard transferCard = (TransferCard) obj;
                Context context = holder.itemView.getContext();
                Intrinsics.checkNotNull(context);
                Intrinsics.echo(context, "context");
                Float distance = transferCard.getDistance();
                if (distance != null) {
                    float floatValue = distance.floatValue();
                    if (floatValue < 0.5d) {
                        str = context.getString(R.string.distance_meters, Integer.valueOf((int) (floatValue * 1000)));
                    } else {
                        str = context.getString(R.string.distance_kilometers, Float.valueOf(floatValue));
                    }
                }
                holder.alpha.setContent(new P.d(new Gb.j(transferCard, str, transferCard.getExpiresAt(), this, i4, 2), -1903466497, true));
                return;
            default:
                Ub.d holder2 = (Ub.d) f0Var;
                Intrinsics.echo(holder2, "holder");
                final AddressNoteListItem note = (AddressNoteListItem) ((ArrayList) this.delta).get(i4);
                Intrinsics.echo(note, "note");
                if (note.getLatitude() != null && note.getLongitude() != null) {
                    holder2.alpha.f192f.setVisibility(0);
                    Double latitude = note.getLatitude();
                    Intrinsics.checkNotNull(latitude);
                    final double doubleValue = latitude.doubleValue();
                    Double longitude = note.getLongitude();
                    Intrinsics.checkNotNull(longitude);
                    final double doubleValue2 = longitude.doubleValue();
                    final LatLng latLng = new LatLng(doubleValue, doubleValue2);
                    N n5 = holder2.alpha;
                    MapView mapView = n5.f193g;
                    mapView.getClass();
                    StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
                    try {
                        s sVar = mapView.alpha;
                        sVar.getClass();
                        sVar.delta(null, new h6.f(sVar, null));
                        if (sVar.alpha == null) {
                            AbstractC1811a.bravo(mapView);
                        }
                        StrictMode.setThreadPolicy(threadPolicy);
                        MapView mapView2 = n5.f193g;
                        final p pVar = holder2.charlie;
                        x6.m mVar = new x6.m() { // from class: Ub.b
                            @Override // x6.m
                            public final void charlie(k kVar) {
                                C2576i echo = kVar.echo();
                                echo.getClass();
                                try {
                                    y6.d dVar = (y6.d) echo.alpha;
                                    Parcel ivory = dVar.ivory();
                                    int i11 = w.alpha;
                                    ivory.writeInt(0);
                                    dVar.lavender(ivory, 18);
                                    try {
                                        y6.d dVar2 = (y6.d) echo.alpha;
                                        Parcel ivory2 = dVar2.ivory();
                                        int i12 = w.alpha;
                                        ivory2.writeInt(0);
                                        dVar2.lavender(ivory2, 1);
                                        try {
                                            y6.d dVar3 = (y6.d) echo.alpha;
                                            Parcel ivory3 = dVar3.ivory();
                                            int i13 = w.alpha;
                                            ivory3.writeInt(0);
                                            dVar3.lavender(ivory3, 2);
                                            try {
                                                y6.d dVar4 = (y6.d) echo.alpha;
                                                Parcel ivory4 = dVar4.ivory();
                                                int i14 = w.alpha;
                                                ivory4.writeInt(0);
                                                dVar4.lavender(ivory4, 8);
                                                kVar.foxtrot(AbstractC2997g3.bravo(LatLng.this, 16.0f));
                                                c cVar = new c(pVar, doubleValue, doubleValue2);
                                                y6.g gVar = kVar.alpha;
                                                try {
                                                    v vVar = new v(cVar);
                                                    Parcel ivory5 = gVar.ivory();
                                                    w.delta(ivory5, vVar);
                                                    gVar.lavender(ivory5, 28);
                                                } catch (RemoteException e) {
                                                    throw new RuntimeRemoteException(e);
                                                }
                                            } catch (RemoteException e4) {
                                                throw new RuntimeRemoteException(e4);
                                            }
                                        } catch (RemoteException e5) {
                                            throw new RuntimeRemoteException(e5);
                                        }
                                    } catch (RemoteException e10) {
                                        throw new RuntimeRemoteException(e10);
                                    }
                                } catch (RemoteException e11) {
                                    throw new RuntimeRemoteException(e11);
                                }
                            }
                        };
                        mapView2.getClass();
                        if (Looper.getMainLooper() == Looper.myLooper()) {
                            s sVar2 = mapView2.alpha;
                            InterfaceC1813c interfaceC1813c = sVar2.alpha;
                            if (interfaceC1813c != null) {
                                ((r) interfaceC1813c).juliet(mVar);
                            } else {
                                sVar2.india.add(mVar);
                            }
                        } else {
                            throw new IllegalStateException("getMapAsync() must be called on the main thread");
                        }
                    } catch (Throwable th) {
                        StrictMode.setThreadPolicy(threadPolicy);
                        throw th;
                    }
                } else {
                    holder2.alpha.f192f.setVisibility(8);
                }
                O o5 = (O) holder2.alpha;
                o5.f204r = AbstractC2670h5.charlie(note.getCreatedAt());
                synchronized (o5) {
                    o5.f209u |= 8;
                }
                o5.delta();
                o5.oscar();
                holder2.alpha.sierra(note.getDescription());
                holder2.alpha.tango(note.getUpVotes());
                holder2.alpha.romeo(note.getDownVotes());
                Ub.f fVar = holder2.bravo;
                List<Attachment> newList = note.getAttachments();
                fVar.getClass();
                Intrinsics.echo(newList, "newList");
                ArrayList arrayList = fVar.alpha;
                arrayList.clear();
                arrayList.addAll(newList);
                fVar.notifyDataSetChanged();
                LinearLayout linearLayout = holder2.alpha.f195i;
                final p pVar2 = holder2.charlie;
                linearLayout.setOnClickListener(new View.OnClickListener(pVar2, note, i10) { // from class: Ub.a
                    public final /* synthetic */ int alpha;
                    public final /* synthetic */ p purple;

                    {
                        this.alpha = i10;
                        this.purple = pVar2;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (this.alpha) {
                            case 0:
                                this.purple.getClass();
                                return;
                            default:
                                this.purple.getClass();
                                return;
                        }
                    }
                });
                LinearLayout linearLayout2 = holder2.alpha.f194h;
                final p pVar3 = holder2.charlie;
                linearLayout2.setOnClickListener(new View.OnClickListener(pVar3, note, i5) { // from class: Ub.a
                    public final /* synthetic */ int alpha;
                    public final /* synthetic */ p purple;

                    {
                        this.alpha = i5;
                        this.purple = pVar3;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (this.alpha) {
                            case 0:
                                this.purple.getClass();
                                return;
                            default:
                                this.purple.getClass();
                                return;
                        }
                    }
                });
                holder2.alpha.hotel();
                return;
        }
    }

    @Override // androidx.recyclerview.widget.az
    public final f0 onCreateViewHolder(ViewGroup parent, int i4) {
        switch (this.charlie) {
            case 0:
                Intrinsics.echo(parent, "parent");
                return new o(U2.charlie(parent, R.layout.row_item_transfer_card));
            default:
                Intrinsics.echo(parent, "parent");
                LayoutInflater from = LayoutInflater.from(parent.getContext());
                int i5 = N.f191t;
                N n5 = (N) z1.d.charlie(from, R.layout.row_address_note, parent, false);
                Intrinsics.delta(n5, "inflate(...)");
                return new Ub.d(this, n5);
        }
    }
}

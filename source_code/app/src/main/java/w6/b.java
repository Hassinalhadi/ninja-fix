package w6;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.databinding.ObservableBoolean;
import androidx.databinding.ObservableChar;
import androidx.databinding.ObservableFloat;
import androidx.databinding.ObservableLong;
import androidx.versionedparcelable.ParcelImpl;
import com.google.android.gms.internal.measurement.AbstractC1394y;
import com.google.android.gms.internal.wallet.zzk;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.Cap;
import com.google.android.gms.maps.model.FeatureLayerOptions;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PointOfInterest;
import com.google.android.gms.maps.model.StampStyle;
import com.google.android.gms.maps.model.StreetViewPanoramaLink;
import com.google.android.gms.maps.model.StreetViewSource;
import com.google.android.gms.maps.model.StrokeStyle;
import com.google.android.gms.maps.model.StyleSpan;
import com.google.android.gms.maps.model.TileOverlayOptions;
import h6.BinderC1814d;
import h6.InterfaceC1812b;
import q6.m;
import t6.AbstractC3038p;
import t6.C3;
import z6.j;

/* loaded from: classes2.dex */
public final class b implements Parcelable.Creator {
    public final /* synthetic */ int alpha;

    public /* synthetic */ b(int i4) {
        this.alpha = i4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [com.google.android.gms.maps.model.TileOverlayOptions, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13, types: [com.google.android.gms.maps.model.GroundOverlayOptions, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v15, types: [com.google.android.gms.maps.model.MarkerOptions, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, com.google.android.gms.maps.GoogleMapOptions] */
    /* JADX WARN: Type inference failed for: r1v21, types: [androidx.databinding.ObservableBoolean, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v22, types: [androidx.databinding.ObservableChar, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v23, types: [java.lang.Object, androidx.databinding.ObservableFloat] */
    /* JADX WARN: Type inference failed for: r1v24, types: [java.lang.Object, androidx.databinding.ObservableLong] */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v32, types: [q6.m] */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v51 */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        ?? abstractC1394y;
        z6.b bVar;
        View view;
        double d4 = 0.0d;
        boolean z2 = true;
        int i4 = 0;
        int i5 = 0;
        boolean z10 = false;
        switch (this.alpha) {
            case 0:
                int amber = AbstractC3038p.amber(parcel);
                PendingIntent pendingIntent = null;
                while (parcel.dataPosition() < amber) {
                    int readInt = parcel.readInt();
                    if (((char) readInt) != 1) {
                        AbstractC3038p.zulu(parcel, readInt);
                    } else {
                        pendingIntent = (PendingIntent) AbstractC3038p.hotel(parcel, readInt, PendingIntent.CREATOR);
                    }
                }
                AbstractC3038p.november(parcel, amber);
                return new zzk(pendingIntent);
            case 1:
                int amber2 = AbstractC3038p.amber(parcel);
                int i10 = 0;
                int i11 = 0;
                CameraPosition cameraPosition = null;
                Float f5 = null;
                Float f10 = null;
                LatLngBounds latLngBounds = null;
                Integer num = null;
                String str = null;
                byte b2 = -1;
                byte b4 = -1;
                byte b6 = -1;
                byte b10 = -1;
                byte b11 = -1;
                byte b12 = -1;
                byte b13 = -1;
                byte b14 = -1;
                byte b15 = -1;
                byte b16 = -1;
                byte b17 = -1;
                byte b18 = -1;
                while (parcel.dataPosition() < amber2) {
                    int readInt2 = parcel.readInt();
                    byte b19 = b2;
                    switch ((char) readInt2) {
                        case 2:
                            b2 = AbstractC3038p.papa(parcel, readInt2);
                            continue;
                        case 3:
                            b4 = AbstractC3038p.papa(parcel, readInt2);
                            break;
                        case 4:
                            i10 = AbstractC3038p.uniform(parcel, readInt2);
                            break;
                        case 5:
                            cameraPosition = (CameraPosition) AbstractC3038p.hotel(parcel, readInt2, CameraPosition.CREATOR);
                            break;
                        case 6:
                            b6 = AbstractC3038p.papa(parcel, readInt2);
                            break;
                        case 7:
                            b10 = AbstractC3038p.papa(parcel, readInt2);
                            break;
                        case '\b':
                            b11 = AbstractC3038p.papa(parcel, readInt2);
                            break;
                        case '\t':
                            b12 = AbstractC3038p.papa(parcel, readInt2);
                            break;
                        case '\n':
                            b13 = AbstractC3038p.papa(parcel, readInt2);
                            break;
                        case 11:
                            b14 = AbstractC3038p.papa(parcel, readInt2);
                            break;
                        case '\f':
                            b15 = AbstractC3038p.papa(parcel, readInt2);
                            break;
                        case '\r':
                        case 22:
                        default:
                            AbstractC3038p.zulu(parcel, readInt2);
                            break;
                        case 14:
                            b16 = AbstractC3038p.papa(parcel, readInt2);
                            break;
                        case 15:
                            b17 = AbstractC3038p.papa(parcel, readInt2);
                            break;
                        case 16:
                            f5 = AbstractC3038p.sierra(parcel, readInt2);
                            break;
                        case 17:
                            f10 = AbstractC3038p.sierra(parcel, readInt2);
                            break;
                        case 18:
                            latLngBounds = (LatLngBounds) AbstractC3038p.hotel(parcel, readInt2, LatLngBounds.CREATOR);
                            break;
                        case 19:
                            b18 = AbstractC3038p.papa(parcel, readInt2);
                            break;
                        case 20:
                            num = AbstractC3038p.victor(parcel, readInt2);
                            break;
                        case 21:
                            str = AbstractC3038p.india(parcel, readInt2);
                            break;
                        case 23:
                            i11 = AbstractC3038p.uniform(parcel, readInt2);
                            break;
                    }
                    b2 = b19;
                }
                AbstractC3038p.november(parcel, amber2);
                ?? obj = new Object();
                obj.red = -1;
                obj.f7461g = null;
                obj.f7462h = null;
                obj.f7463i = null;
                obj.f7465k = null;
                obj.f7466l = null;
                obj.alpha = C3.charlie(b2);
                obj.purple = C3.charlie(b4);
                obj.red = i10;
                obj.silver = cameraPosition;
                obj.teal = C3.charlie(b6);
                obj.white = C3.charlie(b10);
                obj.yellow = C3.charlie(b11);
                obj.f7456a = C3.charlie(b12);
                obj.f7457b = C3.charlie(b13);
                obj.f7458c = C3.charlie(b14);
                obj.f7459d = C3.charlie(b15);
                obj.e = C3.charlie(b16);
                obj.f7460f = C3.charlie(b17);
                obj.f7461g = f5;
                obj.f7462h = f10;
                obj.f7463i = latLngBounds;
                obj.f7464j = C3.charlie(b18);
                obj.f7465k = num;
                obj.f7466l = str;
                obj.f7467m = i11;
                return obj;
            case 2:
                return new ParcelImpl(parcel);
            case 3:
                if (parcel.readInt() != 1) {
                    z2 = false;
                }
                ?? obj2 = new Object();
                obj2.alpha = z2;
                return obj2;
            case 4:
                char readInt3 = (char) parcel.readInt();
                ?? obj3 = new Object();
                obj3.alpha = readInt3;
                return obj3;
            case 5:
                float readFloat = parcel.readFloat();
                ?? obj4 = new Object();
                obj4.alpha = readFloat;
                return obj4;
            case 6:
                long readLong = parcel.readLong();
                ?? obj5 = new Object();
                obj5.alpha = readLong;
                return obj5;
            case 7:
                float f11 = 0.0f;
                int amber3 = AbstractC3038p.amber(parcel);
                float f12 = 0.0f;
                float f13 = 0.0f;
                LatLng latLng = null;
                while (parcel.dataPosition() < amber3) {
                    int readInt4 = parcel.readInt();
                    char c3 = (char) readInt4;
                    if (c3 != 2) {
                        if (c3 != 3) {
                            if (c3 != 4) {
                                if (c3 != 5) {
                                    AbstractC3038p.zulu(parcel, readInt4);
                                } else {
                                    f12 = AbstractC3038p.romeo(parcel, readInt4);
                                }
                            } else {
                                f11 = AbstractC3038p.romeo(parcel, readInt4);
                            }
                        } else {
                            f13 = AbstractC3038p.romeo(parcel, readInt4);
                        }
                    } else {
                        latLng = (LatLng) AbstractC3038p.hotel(parcel, readInt4, LatLng.CREATOR);
                    }
                }
                AbstractC3038p.november(parcel, amber3);
                return new CameraPosition(latLng, f13, f11, f12);
            case 8:
                int amber4 = AbstractC3038p.amber(parcel);
                while (parcel.dataPosition() < amber4) {
                    int readInt5 = parcel.readInt();
                    if (((char) readInt5) != 2) {
                        AbstractC3038p.zulu(parcel, readInt5);
                    } else {
                        i4 = AbstractC3038p.uniform(parcel, readInt5);
                    }
                }
                AbstractC3038p.november(parcel, amber4);
                return new StreetViewSource(i4);
            case 9:
                int amber5 = AbstractC3038p.amber(parcel);
                StrokeStyle strokeStyle = null;
                while (parcel.dataPosition() < amber5) {
                    int readInt6 = parcel.readInt();
                    char c4 = (char) readInt6;
                    if (c4 != 2) {
                        if (c4 != 3) {
                            AbstractC3038p.zulu(parcel, readInt6);
                        } else {
                            d4 = AbstractC3038p.quebec(parcel, readInt6);
                        }
                    } else {
                        strokeStyle = (StrokeStyle) AbstractC3038p.hotel(parcel, readInt6, StrokeStyle.CREATOR);
                    }
                }
                AbstractC3038p.november(parcel, amber5);
                return new StyleSpan(strokeStyle, d4);
            case 10:
                int amber6 = AbstractC3038p.amber(parcel);
                boolean z11 = true;
                IBinder iBinder = null;
                float f14 = 0.0f;
                float f15 = 0.0f;
                while (parcel.dataPosition() < amber6) {
                    int readInt7 = parcel.readInt();
                    char c10 = (char) readInt7;
                    if (c10 != 2) {
                        if (c10 != 3) {
                            if (c10 != 4) {
                                if (c10 != 5) {
                                    if (c10 != 6) {
                                        AbstractC3038p.zulu(parcel, readInt7);
                                    } else {
                                        f15 = AbstractC3038p.romeo(parcel, readInt7);
                                    }
                                } else {
                                    z11 = AbstractC3038p.oscar(parcel, readInt7);
                                }
                            } else {
                                f14 = AbstractC3038p.romeo(parcel, readInt7);
                            }
                        } else {
                            z10 = AbstractC3038p.oscar(parcel, readInt7);
                        }
                    } else {
                        iBinder = AbstractC3038p.tango(parcel, readInt7);
                    }
                }
                AbstractC3038p.november(parcel, amber6);
                ?? obj6 = new Object();
                obj6.purple = true;
                obj6.silver = true;
                obj6.teal = 0.0f;
                int i12 = j.india;
                if (iBinder == null) {
                    abstractC1394y = 0;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.ITileProviderDelegate");
                    if (queryLocalInterface instanceof m) {
                        abstractC1394y = (m) queryLocalInterface;
                    } else {
                        abstractC1394y = new AbstractC1394y(iBinder, "com.google.android.gms.maps.model.internal.ITileProviderDelegate", 4);
                    }
                }
                obj6.alpha = abstractC1394y;
                obj6.purple = z10;
                obj6.red = f14;
                obj6.silver = z11;
                obj6.teal = f15;
                return obj6;
            case 11:
                int amber7 = AbstractC3038p.amber(parcel);
                IBinder iBinder2 = null;
                Float f16 = null;
                while (parcel.dataPosition() < amber7) {
                    int readInt8 = parcel.readInt();
                    char c11 = (char) readInt8;
                    if (c11 != 2) {
                        if (c11 != 3) {
                            if (c11 != 4) {
                                AbstractC3038p.zulu(parcel, readInt8);
                            } else {
                                f16 = AbstractC3038p.sierra(parcel, readInt8);
                            }
                        } else {
                            iBinder2 = AbstractC3038p.tango(parcel, readInt8);
                        }
                    } else {
                        i5 = AbstractC3038p.uniform(parcel, readInt8);
                    }
                }
                AbstractC3038p.november(parcel, amber7);
                if (iBinder2 == null) {
                    bVar = null;
                } else {
                    bVar = new z6.b(BinderC1814d.lime(iBinder2));
                }
                return new Cap(i5, bVar, f16);
            case 12:
                int amber8 = AbstractC3038p.amber(parcel);
                String str2 = null;
                String str3 = null;
                while (parcel.dataPosition() < amber8) {
                    int readInt9 = parcel.readInt();
                    char c12 = (char) readInt9;
                    if (c12 != 1) {
                        if (c12 != 2) {
                            AbstractC3038p.zulu(parcel, readInt9);
                        } else {
                            str2 = AbstractC3038p.india(parcel, readInt9);
                        }
                    } else {
                        str3 = AbstractC3038p.india(parcel, readInt9);
                    }
                }
                AbstractC3038p.november(parcel, amber8);
                return new FeatureLayerOptions(str3, str2);
            case 13:
                int amber9 = AbstractC3038p.amber(parcel);
                boolean z12 = false;
                boolean z13 = false;
                LatLng latLng2 = null;
                LatLngBounds latLngBounds2 = null;
                float f17 = 0.0f;
                float f18 = 0.0f;
                float f19 = 0.0f;
                float f20 = 0.0f;
                IBinder iBinder3 = null;
                float f21 = 0.0f;
                float f22 = 0.0f;
                float f23 = 0.0f;
                while (parcel.dataPosition() < amber9) {
                    int readInt10 = parcel.readInt();
                    switch ((char) readInt10) {
                        case 2:
                            iBinder3 = AbstractC3038p.tango(parcel, readInt10);
                            break;
                        case 3:
                            latLng2 = (LatLng) AbstractC3038p.hotel(parcel, readInt10, LatLng.CREATOR);
                            break;
                        case 4:
                            f17 = AbstractC3038p.romeo(parcel, readInt10);
                            break;
                        case 5:
                            f18 = AbstractC3038p.romeo(parcel, readInt10);
                            break;
                        case 6:
                            latLngBounds2 = (LatLngBounds) AbstractC3038p.hotel(parcel, readInt10, LatLngBounds.CREATOR);
                            break;
                        case 7:
                            f19 = AbstractC3038p.romeo(parcel, readInt10);
                            break;
                        case '\b':
                            f20 = AbstractC3038p.romeo(parcel, readInt10);
                            break;
                        case '\t':
                            z12 = AbstractC3038p.oscar(parcel, readInt10);
                            break;
                        case '\n':
                            f21 = AbstractC3038p.romeo(parcel, readInt10);
                            break;
                        case 11:
                            f22 = AbstractC3038p.romeo(parcel, readInt10);
                            break;
                        case '\f':
                            f23 = AbstractC3038p.romeo(parcel, readInt10);
                            break;
                        case '\r':
                            z13 = AbstractC3038p.oscar(parcel, readInt10);
                            break;
                        default:
                            AbstractC3038p.zulu(parcel, readInt10);
                            break;
                    }
                }
                AbstractC3038p.november(parcel, amber9);
                ?? obj7 = new Object();
                obj7.f7473a = true;
                obj7.f7474b = 0.0f;
                obj7.f7475c = 0.5f;
                obj7.f7476d = 0.5f;
                obj7.e = false;
                obj7.alpha = new z6.b(BinderC1814d.lime(iBinder3));
                obj7.purple = latLng2;
                obj7.red = f17;
                obj7.silver = f18;
                obj7.teal = latLngBounds2;
                obj7.white = f19;
                obj7.yellow = f20;
                obj7.f7473a = z12;
                obj7.f7474b = f21;
                obj7.f7475c = f22;
                obj7.f7476d = f23;
                obj7.e = z13;
                return obj7;
            case 14:
                int amber10 = AbstractC3038p.amber(parcel);
                double d9 = 0.0d;
                while (parcel.dataPosition() < amber10) {
                    int readInt11 = parcel.readInt();
                    char c13 = (char) readInt11;
                    if (c13 != 2) {
                        if (c13 != 3) {
                            AbstractC3038p.zulu(parcel, readInt11);
                        } else {
                            d9 = AbstractC3038p.quebec(parcel, readInt11);
                        }
                    } else {
                        d4 = AbstractC3038p.quebec(parcel, readInt11);
                    }
                }
                AbstractC3038p.november(parcel, amber10);
                return new LatLng(d4, d9);
            case 15:
                int amber11 = AbstractC3038p.amber(parcel);
                float f24 = 1.0f;
                float f25 = 0.5f;
                boolean z14 = false;
                boolean z15 = false;
                boolean z16 = false;
                int i13 = 0;
                int i14 = 0;
                LatLng latLng3 = null;
                String str4 = null;
                String str5 = null;
                IBinder iBinder4 = null;
                float f26 = 0.0f;
                float f27 = 0.0f;
                float f28 = 0.0f;
                float f29 = 0.0f;
                float f30 = 0.0f;
                IBinder iBinder5 = null;
                String str6 = null;
                float f31 = 0.0f;
                while (parcel.dataPosition() < amber11) {
                    int readInt12 = parcel.readInt();
                    switch ((char) readInt12) {
                        case 2:
                            latLng3 = (LatLng) AbstractC3038p.hotel(parcel, readInt12, LatLng.CREATOR);
                            break;
                        case 3:
                            str4 = AbstractC3038p.india(parcel, readInt12);
                            break;
                        case 4:
                            str5 = AbstractC3038p.india(parcel, readInt12);
                            break;
                        case 5:
                            iBinder4 = AbstractC3038p.tango(parcel, readInt12);
                            break;
                        case 6:
                            f26 = AbstractC3038p.romeo(parcel, readInt12);
                            break;
                        case 7:
                            f27 = AbstractC3038p.romeo(parcel, readInt12);
                            break;
                        case '\b':
                            z14 = AbstractC3038p.oscar(parcel, readInt12);
                            break;
                        case '\t':
                            z15 = AbstractC3038p.oscar(parcel, readInt12);
                            break;
                        case '\n':
                            z16 = AbstractC3038p.oscar(parcel, readInt12);
                            break;
                        case 11:
                            f28 = AbstractC3038p.romeo(parcel, readInt12);
                            break;
                        case '\f':
                            f25 = AbstractC3038p.romeo(parcel, readInt12);
                            break;
                        case '\r':
                            f29 = AbstractC3038p.romeo(parcel, readInt12);
                            break;
                        case 14:
                            f24 = AbstractC3038p.romeo(parcel, readInt12);
                            break;
                        case 15:
                            f30 = AbstractC3038p.romeo(parcel, readInt12);
                            break;
                        case 16:
                        default:
                            AbstractC3038p.zulu(parcel, readInt12);
                            break;
                        case 17:
                            i13 = AbstractC3038p.uniform(parcel, readInt12);
                            break;
                        case 18:
                            iBinder5 = AbstractC3038p.tango(parcel, readInt12);
                            break;
                        case 19:
                            i14 = AbstractC3038p.uniform(parcel, readInt12);
                            break;
                        case 20:
                            str6 = AbstractC3038p.india(parcel, readInt12);
                            break;
                        case 21:
                            f31 = AbstractC3038p.romeo(parcel, readInt12);
                            break;
                    }
                }
                AbstractC3038p.november(parcel, amber11);
                ?? obj8 = new Object();
                obj8.teal = 0.5f;
                obj8.white = 1.0f;
                obj8.f7477a = true;
                obj8.f7478b = false;
                obj8.f7479c = 0.0f;
                obj8.f7480d = 0.5f;
                obj8.e = 0.0f;
                obj8.f7481f = 1.0f;
                obj8.f7483h = 0;
                obj8.alpha = latLng3;
                obj8.purple = str4;
                obj8.red = str5;
                if (iBinder4 == null) {
                    obj8.silver = null;
                } else {
                    obj8.silver = new z6.b(BinderC1814d.lime(iBinder4));
                }
                obj8.teal = f26;
                obj8.white = f27;
                obj8.yellow = z14;
                obj8.f7477a = z15;
                obj8.f7478b = z16;
                obj8.f7479c = f28;
                obj8.f7480d = f25;
                obj8.e = f29;
                obj8.f7481f = f24;
                obj8.f7482g = f30;
                obj8.f7485j = i14;
                obj8.f7483h = i13;
                InterfaceC1812b lime = BinderC1814d.lime(iBinder5);
                if (lime == null) {
                    view = null;
                } else {
                    view = (View) BinderC1814d.magenta(lime);
                }
                obj8.f7484i = view;
                obj8.f7486k = str6;
                obj8.f7487l = f31;
                return obj8;
            case 16:
                int amber12 = AbstractC3038p.amber(parcel);
                String str7 = null;
                String str8 = null;
                LatLng latLng4 = null;
                while (parcel.dataPosition() < amber12) {
                    int readInt13 = parcel.readInt();
                    char c14 = (char) readInt13;
                    if (c14 != 2) {
                        if (c14 != 3) {
                            if (c14 != 4) {
                                AbstractC3038p.zulu(parcel, readInt13);
                            } else {
                                str8 = AbstractC3038p.india(parcel, readInt13);
                            }
                        } else {
                            str7 = AbstractC3038p.india(parcel, readInt13);
                        }
                    } else {
                        latLng4 = (LatLng) AbstractC3038p.hotel(parcel, readInt13, LatLng.CREATOR);
                    }
                }
                AbstractC3038p.november(parcel, amber12);
                return new PointOfInterest(latLng4, str7, str8);
            case 17:
                int amber13 = AbstractC3038p.amber(parcel);
                IBinder iBinder6 = null;
                while (parcel.dataPosition() < amber13) {
                    int readInt14 = parcel.readInt();
                    if (((char) readInt14) != 2) {
                        AbstractC3038p.zulu(parcel, readInt14);
                    } else {
                        iBinder6 = AbstractC3038p.tango(parcel, readInt14);
                    }
                }
                AbstractC3038p.november(parcel, amber13);
                return new StampStyle(iBinder6);
            default:
                int amber14 = AbstractC3038p.amber(parcel);
                float f32 = 0.0f;
                String str9 = null;
                while (parcel.dataPosition() < amber14) {
                    int readInt15 = parcel.readInt();
                    char c15 = (char) readInt15;
                    if (c15 != 2) {
                        if (c15 != 3) {
                            AbstractC3038p.zulu(parcel, readInt15);
                        } else {
                            f32 = AbstractC3038p.romeo(parcel, readInt15);
                        }
                    } else {
                        str9 = AbstractC3038p.india(parcel, readInt15);
                    }
                }
                AbstractC3038p.november(parcel, amber14);
                return new StreetViewPanoramaLink(str9, f32);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i4) {
        switch (this.alpha) {
            case 0:
                return new zzk[i4];
            case 1:
                return new GoogleMapOptions[i4];
            case 2:
                return new ParcelImpl[i4];
            case 3:
                return new ObservableBoolean[i4];
            case 4:
                return new ObservableChar[i4];
            case 5:
                return new ObservableFloat[i4];
            case 6:
                return new ObservableLong[i4];
            case 7:
                return new CameraPosition[i4];
            case 8:
                return new StreetViewSource[i4];
            case 9:
                return new StyleSpan[i4];
            case 10:
                return new TileOverlayOptions[i4];
            case 11:
                return new Cap[i4];
            case 12:
                return new FeatureLayerOptions[i4];
            case 13:
                return new GroundOverlayOptions[i4];
            case 14:
                return new LatLng[i4];
            case 15:
                return new MarkerOptions[i4];
            case 16:
                return new PointOfInterest[i4];
            case 17:
                return new StampStyle[i4];
            default:
                return new StreetViewPanoramaLink[i4];
        }
    }
}

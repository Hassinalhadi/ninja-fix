package w6;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.RemoteViews;
import androidx.databinding.ObservableByte;
import androidx.databinding.ObservableDouble;
import androidx.databinding.ObservableInt;
import androidx.databinding.ObservableShort;
import com.google.android.gms.internal.wallet.zzm;
import com.google.android.gms.maps.StreetViewPanoramaOptions;
import com.google.android.gms.maps.model.Cap;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.FeatureStyle;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.google.android.gms.maps.model.PatternItem;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.StampStyle;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import com.google.android.gms.maps.model.StreetViewPanoramaLink;
import com.google.android.gms.maps.model.StreetViewPanoramaLocation;
import com.google.android.gms.maps.model.StreetViewPanoramaOrientation;
import com.google.android.gms.maps.model.StreetViewSource;
import com.google.android.gms.maps.model.StrokeStyle;
import com.google.android.gms.maps.model.StyleSpan;
import com.google.android.gms.maps.model.Tile;
import com.google.android.gms.maps.model.VisibleRegion;
import com.google.firebase.perf.session.PerfSession;
import java.util.ArrayList;
import t6.AbstractC3038p;
import t6.C3;

/* loaded from: classes2.dex */
public final class c implements Parcelable.Creator {
    public final /* synthetic */ int alpha;

    public /* synthetic */ c(int i4) {
        this.alpha = i4;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, com.google.android.gms.internal.wallet.zzm] */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.google.android.gms.maps.StreetViewPanoramaOptions, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9, types: [com.google.android.gms.maps.model.CircleOptions, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v11, types: [androidx.databinding.ObservableByte, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12, types: [androidx.databinding.ObservableDouble, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object, androidx.databinding.ObservableInt] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object, androidx.databinding.ObservableShort] */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.alpha) {
            case 0:
                int amber = AbstractC3038p.amber(parcel);
                String[] strArr = null;
                int[] iArr = null;
                RemoteViews remoteViews = null;
                byte[] bArr = null;
                while (parcel.dataPosition() < amber) {
                    int readInt = parcel.readInt();
                    char c3 = (char) readInt;
                    if (c3 != 1) {
                        if (c3 != 2) {
                            if (c3 != 3) {
                                if (c3 != 4) {
                                    AbstractC3038p.zulu(parcel, readInt);
                                } else {
                                    bArr = AbstractC3038p.delta(parcel, readInt);
                                }
                            } else {
                                remoteViews = (RemoteViews) AbstractC3038p.hotel(parcel, readInt, RemoteViews.CREATOR);
                            }
                        } else {
                            iArr = AbstractC3038p.foxtrot(parcel, readInt);
                        }
                    } else {
                        strArr = AbstractC3038p.juliet(parcel, readInt);
                    }
                }
                AbstractC3038p.november(parcel, amber);
                ?? obj = new Object();
                obj.alpha = strArr;
                obj.purple = iArr;
                obj.red = remoteViews;
                obj.silver = bArr;
                return obj;
            case 1:
                int amber2 = AbstractC3038p.amber(parcel);
                StreetViewPanoramaCamera streetViewPanoramaCamera = null;
                LatLng latLng = null;
                Integer num = null;
                StreetViewSource streetViewSource = null;
                byte b2 = 0;
                byte b4 = 0;
                byte b6 = 0;
                byte b10 = 0;
                byte b11 = 0;
                String str = null;
                while (parcel.dataPosition() < amber2) {
                    int readInt2 = parcel.readInt();
                    switch ((char) readInt2) {
                        case 2:
                            streetViewPanoramaCamera = (StreetViewPanoramaCamera) AbstractC3038p.hotel(parcel, readInt2, StreetViewPanoramaCamera.CREATOR);
                            break;
                        case 3:
                            str = AbstractC3038p.india(parcel, readInt2);
                            break;
                        case 4:
                            latLng = (LatLng) AbstractC3038p.hotel(parcel, readInt2, LatLng.CREATOR);
                            break;
                        case 5:
                            num = AbstractC3038p.victor(parcel, readInt2);
                            break;
                        case 6:
                            b2 = AbstractC3038p.papa(parcel, readInt2);
                            break;
                        case 7:
                            b4 = AbstractC3038p.papa(parcel, readInt2);
                            break;
                        case '\b':
                            b6 = AbstractC3038p.papa(parcel, readInt2);
                            break;
                        case '\t':
                            b10 = AbstractC3038p.papa(parcel, readInt2);
                            break;
                        case '\n':
                            b11 = AbstractC3038p.papa(parcel, readInt2);
                            break;
                        case 11:
                            streetViewSource = (StreetViewSource) AbstractC3038p.hotel(parcel, readInt2, StreetViewSource.CREATOR);
                            break;
                        default:
                            AbstractC3038p.zulu(parcel, readInt2);
                            break;
                    }
                }
                AbstractC3038p.november(parcel, amber2);
                ?? obj2 = new Object();
                Boolean bool = Boolean.TRUE;
                obj2.teal = bool;
                obj2.white = bool;
                obj2.yellow = bool;
                obj2.f7468a = bool;
                obj2.f7470c = StreetViewSource.purple;
                obj2.alpha = streetViewPanoramaCamera;
                obj2.red = latLng;
                obj2.silver = num;
                obj2.purple = str;
                obj2.teal = C3.charlie(b2);
                obj2.white = C3.charlie(b4);
                obj2.yellow = C3.charlie(b6);
                obj2.f7468a = C3.charlie(b10);
                obj2.f7469b = C3.charlie(b11);
                obj2.f7470c = streetViewSource;
                return obj2;
            case 2:
                return new PerfSession(parcel);
            case 3:
                byte readByte = parcel.readByte();
                ?? obj3 = new Object();
                obj3.alpha = readByte;
                return obj3;
            case 4:
                double readDouble = parcel.readDouble();
                ?? obj4 = new Object();
                obj4.alpha = readDouble;
                return obj4;
            case 5:
                int readInt3 = parcel.readInt();
                ?? obj5 = new Object();
                obj5.alpha = readInt3;
                return obj5;
            case 6:
                short readInt4 = (short) parcel.readInt();
                ?? obj6 = new Object();
                obj6.alpha = readInt4;
                return obj6;
            case 7:
                int amber3 = AbstractC3038p.amber(parcel);
                float f5 = 0.0f;
                float f10 = 0.0f;
                while (parcel.dataPosition() < amber3) {
                    int readInt5 = parcel.readInt();
                    char c4 = (char) readInt5;
                    if (c4 != 2) {
                        if (c4 != 3) {
                            AbstractC3038p.zulu(parcel, readInt5);
                        } else {
                            f10 = AbstractC3038p.romeo(parcel, readInt5);
                        }
                    } else {
                        f5 = AbstractC3038p.romeo(parcel, readInt5);
                    }
                }
                AbstractC3038p.november(parcel, amber3);
                return new StreetViewPanoramaOrientation(f5, f10);
            case 8:
                int amber4 = AbstractC3038p.amber(parcel);
                StampStyle stampStyle = null;
                int i4 = 0;
                int i5 = 0;
                boolean z2 = false;
                float f11 = 0.0f;
                while (parcel.dataPosition() < amber4) {
                    int readInt6 = parcel.readInt();
                    char c10 = (char) readInt6;
                    if (c10 != 2) {
                        if (c10 != 3) {
                            if (c10 != 4) {
                                if (c10 != 5) {
                                    if (c10 != 6) {
                                        AbstractC3038p.zulu(parcel, readInt6);
                                    } else {
                                        stampStyle = (StampStyle) AbstractC3038p.hotel(parcel, readInt6, StampStyle.CREATOR);
                                    }
                                } else {
                                    z2 = AbstractC3038p.oscar(parcel, readInt6);
                                }
                            } else {
                                i5 = AbstractC3038p.uniform(parcel, readInt6);
                            }
                        } else {
                            i4 = AbstractC3038p.uniform(parcel, readInt6);
                        }
                    } else {
                        f11 = AbstractC3038p.romeo(parcel, readInt6);
                    }
                }
                AbstractC3038p.november(parcel, amber4);
                return new StrokeStyle(f11, i4, i5, z2, stampStyle);
            case 9:
                int amber5 = AbstractC3038p.amber(parcel);
                byte[] bArr2 = null;
                int i10 = 0;
                int i11 = 0;
                while (parcel.dataPosition() < amber5) {
                    int readInt7 = parcel.readInt();
                    char c11 = (char) readInt7;
                    if (c11 != 2) {
                        if (c11 != 3) {
                            if (c11 != 4) {
                                AbstractC3038p.zulu(parcel, readInt7);
                            } else {
                                bArr2 = AbstractC3038p.delta(parcel, readInt7);
                            }
                        } else {
                            i11 = AbstractC3038p.uniform(parcel, readInt7);
                        }
                    } else {
                        i10 = AbstractC3038p.uniform(parcel, readInt7);
                    }
                }
                AbstractC3038p.november(parcel, amber5);
                return new Tile(bArr2, i10, i11);
            case 10:
                int amber6 = AbstractC3038p.amber(parcel);
                LatLng latLng2 = null;
                LatLng latLng3 = null;
                LatLng latLng4 = null;
                LatLng latLng5 = null;
                LatLngBounds latLngBounds = null;
                while (parcel.dataPosition() < amber6) {
                    int readInt8 = parcel.readInt();
                    char c12 = (char) readInt8;
                    if (c12 != 2) {
                        if (c12 != 3) {
                            if (c12 != 4) {
                                if (c12 != 5) {
                                    if (c12 != 6) {
                                        AbstractC3038p.zulu(parcel, readInt8);
                                    } else {
                                        latLngBounds = (LatLngBounds) AbstractC3038p.hotel(parcel, readInt8, LatLngBounds.CREATOR);
                                    }
                                } else {
                                    latLng5 = (LatLng) AbstractC3038p.hotel(parcel, readInt8, LatLng.CREATOR);
                                }
                            } else {
                                latLng4 = (LatLng) AbstractC3038p.hotel(parcel, readInt8, LatLng.CREATOR);
                            }
                        } else {
                            latLng3 = (LatLng) AbstractC3038p.hotel(parcel, readInt8, LatLng.CREATOR);
                        }
                    } else {
                        latLng2 = (LatLng) AbstractC3038p.hotel(parcel, readInt8, LatLng.CREATOR);
                    }
                }
                AbstractC3038p.november(parcel, amber6);
                return new VisibleRegion(latLng2, latLng3, latLng4, latLng5, latLngBounds);
            case 11:
                int amber7 = AbstractC3038p.amber(parcel);
                LatLng latLng6 = null;
                boolean z10 = false;
                float f12 = 0.0f;
                float f13 = 0.0f;
                double d4 = 0.0d;
                ArrayList arrayList = null;
                int i12 = 0;
                int i13 = 0;
                boolean z11 = false;
                while (parcel.dataPosition() < amber7) {
                    int readInt9 = parcel.readInt();
                    switch ((char) readInt9) {
                        case 2:
                            latLng6 = (LatLng) AbstractC3038p.hotel(parcel, readInt9, LatLng.CREATOR);
                            break;
                        case 3:
                            d4 = AbstractC3038p.quebec(parcel, readInt9);
                            break;
                        case 4:
                            f12 = AbstractC3038p.romeo(parcel, readInt9);
                            break;
                        case 5:
                            i12 = AbstractC3038p.uniform(parcel, readInt9);
                            break;
                        case 6:
                            i13 = AbstractC3038p.uniform(parcel, readInt9);
                            break;
                        case 7:
                            f13 = AbstractC3038p.romeo(parcel, readInt9);
                            break;
                        case '\b':
                            z11 = AbstractC3038p.oscar(parcel, readInt9);
                            break;
                        case '\t':
                            z10 = AbstractC3038p.oscar(parcel, readInt9);
                            break;
                        case '\n':
                            arrayList = AbstractC3038p.mike(parcel, readInt9, PatternItem.CREATOR);
                            break;
                        default:
                            AbstractC3038p.zulu(parcel, readInt9);
                            break;
                    }
                }
                AbstractC3038p.november(parcel, amber7);
                ?? obj7 = new Object();
                obj7.alpha = latLng6;
                obj7.purple = d4;
                obj7.red = f12;
                obj7.silver = i12;
                obj7.teal = i13;
                obj7.white = f13;
                obj7.yellow = z11;
                obj7.f7471a = z10;
                obj7.f7472b = arrayList;
                return obj7;
            case 12:
                int amber8 = AbstractC3038p.amber(parcel);
                Integer num2 = null;
                Integer num3 = null;
                Float f14 = null;
                Float f15 = null;
                while (parcel.dataPosition() < amber8) {
                    int readInt10 = parcel.readInt();
                    char c13 = (char) readInt10;
                    if (c13 != 1) {
                        if (c13 != 2) {
                            if (c13 != 3) {
                                if (c13 != 4) {
                                    AbstractC3038p.zulu(parcel, readInt10);
                                } else {
                                    f15 = AbstractC3038p.sierra(parcel, readInt10);
                                }
                            } else {
                                f14 = AbstractC3038p.sierra(parcel, readInt10);
                            }
                        } else {
                            num3 = AbstractC3038p.victor(parcel, readInt10);
                        }
                    } else {
                        num2 = AbstractC3038p.victor(parcel, readInt10);
                    }
                }
                AbstractC3038p.november(parcel, amber8);
                return new FeatureStyle(num2, num3, f14, f15);
            case 13:
                int amber9 = AbstractC3038p.amber(parcel);
                LatLng latLng7 = null;
                LatLng latLng8 = null;
                while (parcel.dataPosition() < amber9) {
                    int readInt11 = parcel.readInt();
                    char c14 = (char) readInt11;
                    if (c14 != 2) {
                        if (c14 != 3) {
                            AbstractC3038p.zulu(parcel, readInt11);
                        } else {
                            latLng8 = (LatLng) AbstractC3038p.hotel(parcel, readInt11, LatLng.CREATOR);
                        }
                    } else {
                        latLng7 = (LatLng) AbstractC3038p.hotel(parcel, readInt11, LatLng.CREATOR);
                    }
                }
                AbstractC3038p.november(parcel, amber9);
                return new LatLngBounds(latLng7, latLng8);
            case 14:
                int amber10 = AbstractC3038p.amber(parcel);
                String str2 = null;
                while (parcel.dataPosition() < amber10) {
                    int readInt12 = parcel.readInt();
                    if (((char) readInt12) != 2) {
                        AbstractC3038p.zulu(parcel, readInt12);
                    } else {
                        str2 = AbstractC3038p.india(parcel, readInt12);
                    }
                }
                AbstractC3038p.november(parcel, amber10);
                return new MapStyleOptions(str2);
            case 15:
                int amber11 = AbstractC3038p.amber(parcel);
                Float f16 = null;
                int i14 = 0;
                while (parcel.dataPosition() < amber11) {
                    int readInt13 = parcel.readInt();
                    char c15 = (char) readInt13;
                    if (c15 != 2) {
                        if (c15 != 3) {
                            AbstractC3038p.zulu(parcel, readInt13);
                        } else {
                            f16 = AbstractC3038p.sierra(parcel, readInt13);
                        }
                    } else {
                        i14 = AbstractC3038p.uniform(parcel, readInt13);
                    }
                }
                AbstractC3038p.november(parcel, amber11);
                return new PatternItem(i14, f16);
            case 16:
                int amber12 = AbstractC3038p.amber(parcel);
                ArrayList arrayList2 = null;
                Cap cap = null;
                Cap cap2 = null;
                ArrayList arrayList3 = null;
                ArrayList arrayList4 = null;
                int i15 = 0;
                boolean z12 = false;
                boolean z13 = false;
                boolean z14 = false;
                int i16 = 0;
                float f17 = 0.0f;
                float f18 = 0.0f;
                while (parcel.dataPosition() < amber12) {
                    int readInt14 = parcel.readInt();
                    switch ((char) readInt14) {
                        case 2:
                            arrayList2 = AbstractC3038p.mike(parcel, readInt14, LatLng.CREATOR);
                            break;
                        case 3:
                            f17 = AbstractC3038p.romeo(parcel, readInt14);
                            break;
                        case 4:
                            i15 = AbstractC3038p.uniform(parcel, readInt14);
                            break;
                        case 5:
                            f18 = AbstractC3038p.romeo(parcel, readInt14);
                            break;
                        case 6:
                            z12 = AbstractC3038p.oscar(parcel, readInt14);
                            break;
                        case 7:
                            z13 = AbstractC3038p.oscar(parcel, readInt14);
                            break;
                        case '\b':
                            z14 = AbstractC3038p.oscar(parcel, readInt14);
                            break;
                        case '\t':
                            cap = (Cap) AbstractC3038p.hotel(parcel, readInt14, Cap.CREATOR);
                            break;
                        case '\n':
                            cap2 = (Cap) AbstractC3038p.hotel(parcel, readInt14, Cap.CREATOR);
                            break;
                        case 11:
                            i16 = AbstractC3038p.uniform(parcel, readInt14);
                            break;
                        case '\f':
                            arrayList3 = AbstractC3038p.mike(parcel, readInt14, PatternItem.CREATOR);
                            break;
                        case '\r':
                            arrayList4 = AbstractC3038p.mike(parcel, readInt14, StyleSpan.CREATOR);
                            break;
                        default:
                            AbstractC3038p.zulu(parcel, readInt14);
                            break;
                    }
                }
                AbstractC3038p.november(parcel, amber12);
                return new PolylineOptions(arrayList2, f17, i15, f18, z12, z13, z14, cap, cap2, i16, arrayList3, arrayList4);
            case 17:
                int amber13 = AbstractC3038p.amber(parcel);
                float f19 = 0.0f;
                float f20 = 0.0f;
                float f21 = 0.0f;
                while (parcel.dataPosition() < amber13) {
                    int readInt15 = parcel.readInt();
                    char c16 = (char) readInt15;
                    if (c16 != 2) {
                        if (c16 != 3) {
                            if (c16 != 4) {
                                AbstractC3038p.zulu(parcel, readInt15);
                            } else {
                                f21 = AbstractC3038p.romeo(parcel, readInt15);
                            }
                        } else {
                            f20 = AbstractC3038p.romeo(parcel, readInt15);
                        }
                    } else {
                        f19 = AbstractC3038p.romeo(parcel, readInt15);
                    }
                }
                AbstractC3038p.november(parcel, amber13);
                return new StreetViewPanoramaCamera(f19, f20, f21);
            default:
                int amber14 = AbstractC3038p.amber(parcel);
                StreetViewPanoramaLink[] streetViewPanoramaLinkArr = null;
                LatLng latLng9 = null;
                String str3 = null;
                while (parcel.dataPosition() < amber14) {
                    int readInt16 = parcel.readInt();
                    char c17 = (char) readInt16;
                    if (c17 != 2) {
                        if (c17 != 3) {
                            if (c17 != 4) {
                                AbstractC3038p.zulu(parcel, readInt16);
                            } else {
                                str3 = AbstractC3038p.india(parcel, readInt16);
                            }
                        } else {
                            latLng9 = (LatLng) AbstractC3038p.hotel(parcel, readInt16, LatLng.CREATOR);
                        }
                    } else {
                        streetViewPanoramaLinkArr = (StreetViewPanoramaLink[]) AbstractC3038p.lima(parcel, readInt16, StreetViewPanoramaLink.CREATOR);
                    }
                }
                AbstractC3038p.november(parcel, amber14);
                return new StreetViewPanoramaLocation(streetViewPanoramaLinkArr, latLng9, str3);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i4) {
        switch (this.alpha) {
            case 0:
                return new zzm[i4];
            case 1:
                return new StreetViewPanoramaOptions[i4];
            case 2:
                return new PerfSession[i4];
            case 3:
                return new ObservableByte[i4];
            case 4:
                return new ObservableDouble[i4];
            case 5:
                return new ObservableInt[i4];
            case 6:
                return new ObservableShort[i4];
            case 7:
                return new StreetViewPanoramaOrientation[i4];
            case 8:
                return new StrokeStyle[i4];
            case 9:
                return new Tile[i4];
            case 10:
                return new VisibleRegion[i4];
            case 11:
                return new CircleOptions[i4];
            case 12:
                return new FeatureStyle[i4];
            case 13:
                return new LatLngBounds[i4];
            case 14:
                return new MapStyleOptions[i4];
            case 15:
                return new PatternItem[i4];
            case 16:
                return new PolylineOptions[i4];
            case 17:
                return new StreetViewPanoramaCamera[i4];
            default:
                return new StreetViewPanoramaLocation[i4];
        }
    }
}

package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.measurement.y, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1394y implements IInterface {
    public final /* synthetic */ int golf;
    public final IBinder hotel;
    public final String india;

    public /* synthetic */ AbstractC1394y(IBinder iBinder, String str, int i4) {
        this.golf = i4;
        this.hotel = iBinder;
        this.india = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        switch (this.golf) {
            case 0:
                return this.hotel;
            case 1:
                return this.hotel;
            case 2:
                return this.hotel;
            case 3:
                return this.hotel;
            case 4:
                return this.hotel;
            case 5:
                return this.hotel;
            default:
                return this.hotel;
        }
    }

    public void bravo(Parcel parcel, int i4) {
        Parcel obtain = Parcel.obtain();
        try {
            this.hotel.transact(i4, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public Parcel charlie(Parcel parcel, int i4) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.hotel.transact(i4, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e) {
                obtain.recycle();
                throw e;
            }
        } finally {
            parcel.recycle();
        }
    }

    public Parcel delta(Parcel parcel, int i4) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.hotel.transact(i4, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e) {
                obtain.recycle();
                throw e;
            }
        } finally {
            parcel.recycle();
        }
    }

    public Parcel ivory() {
        switch (this.golf) {
            case 0:
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken(this.india);
                return obtain;
            case 1:
            default:
                Parcel obtain2 = Parcel.obtain();
                obtain2.writeInterfaceToken(this.india);
                return obtain2;
            case 2:
                Parcel obtain3 = Parcel.obtain();
                obtain3.writeInterfaceToken(this.india);
                return obtain3;
            case 3:
                Parcel obtain4 = Parcel.obtain();
                obtain4.writeInterfaceToken(this.india);
                return obtain4;
            case 4:
                Parcel obtain5 = Parcel.obtain();
                obtain5.writeInterfaceToken(this.india);
                return obtain5;
        }
    }

    public Parcel jade(Parcel parcel, int i4) {
        switch (this.golf) {
            case 0:
                Parcel obtain = Parcel.obtain();
                try {
                    try {
                        this.hotel.transact(i4, parcel, obtain, 0);
                        obtain.readException();
                        return obtain;
                    } catch (RuntimeException e) {
                        obtain.recycle();
                        throw e;
                    }
                } finally {
                }
            case 3:
                Parcel obtain2 = Parcel.obtain();
                try {
                    try {
                        this.hotel.transact(i4, parcel, obtain2, 0);
                        obtain2.readException();
                        return obtain2;
                    } finally {
                    }
                } catch (RuntimeException e4) {
                    obtain2.recycle();
                    throw e4;
                }
            default:
                Parcel obtain3 = Parcel.obtain();
                try {
                    try {
                        this.hotel.transact(i4, parcel, obtain3, 0);
                        obtain3.readException();
                        return obtain3;
                    } catch (RuntimeException e5) {
                        obtain3.recycle();
                        throw e5;
                    }
                } finally {
                }
        }
    }

    public void lavender(Parcel parcel, int i4) {
        Parcel obtain;
        switch (this.golf) {
            case 0:
                obtain = Parcel.obtain();
                try {
                    this.hotel.transact(i4, parcel, obtain, 0);
                    obtain.readException();
                    return;
                } finally {
                }
            case 1:
            case 2:
            default:
                obtain = Parcel.obtain();
                try {
                    this.hotel.transact(i4, parcel, obtain, 0);
                    obtain.readException();
                    return;
                } finally {
                }
            case 3:
                obtain = Parcel.obtain();
                try {
                    this.hotel.transact(i4, parcel, obtain, 0);
                    obtain.readException();
                    return;
                } finally {
                }
            case 4:
                obtain = Parcel.obtain();
                try {
                    this.hotel.transact(i4, parcel, obtain, 0);
                    obtain.readException();
                    return;
                } finally {
                }
        }
    }

    public void lime(Parcel parcel) {
        try {
            this.hotel.transact(2, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}

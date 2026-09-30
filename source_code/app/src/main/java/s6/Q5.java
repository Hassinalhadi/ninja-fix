package s6;

import android.graphics.drawable.Drawable;
import android.net.NetworkRequest;
import android.net.Uri;
import android.os.Build;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class Q5 {
    public static final LinkedHashSet alpha(byte[] bytes) {
        ObjectInputStream objectInputStream;
        Intrinsics.echo(bytes, "bytes");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (bytes.length != 0) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
            try {
                try {
                    objectInputStream = new ObjectInputStream(byteArrayInputStream);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    int readInt = objectInputStream.readInt();
                    for (int i4 = 0; i4 < readInt; i4++) {
                        Uri uri = Uri.parse(objectInputStream.readUTF());
                        boolean readBoolean = objectInputStream.readBoolean();
                        Intrinsics.delta(uri, "uri");
                        linkedHashSet.add(new A2.c(uri, readBoolean));
                    }
                    objectInputStream.close();
                    byteArrayInputStream.close();
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        AbstractC2716m6.alpha(objectInputStream, th);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    AbstractC2716m6.alpha(byteArrayInputStream, th3);
                    throw th4;
                }
            }
        }
        return linkedHashSet;
    }

    public static final byte[] bravo(K2.e requestCompat) {
        int[] y10;
        boolean hasTransport;
        int[] y11;
        boolean hasCapability;
        Intrinsics.echo(requestCompat, "requestCompat");
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 28) {
            return new byte[0];
        }
        NetworkRequest networkRequest = requestCompat.alpha;
        if (networkRequest == null) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                if (i4 >= 31) {
                    y10 = networkRequest.getTransportTypes();
                    Intrinsics.delta(y10, "request.transportTypes");
                } else {
                    int[] iArr = {2, 0, 3, 6, 10, 9, 8, 4, 1, 5};
                    ArrayList arrayList = new ArrayList();
                    for (int i5 = 0; i5 < 10; i5++) {
                        int i10 = iArr[i5];
                        hasTransport = networkRequest.hasTransport(i10);
                        if (hasTransport) {
                            arrayList.add(Integer.valueOf(i10));
                        }
                    }
                    y10 = CollectionsKt.y(arrayList);
                }
                if (Build.VERSION.SDK_INT >= 31) {
                    y11 = networkRequest.getCapabilities();
                    Intrinsics.delta(y11, "request.capabilities");
                } else {
                    int[] iArr2 = {17, 5, 2, 10, 29, 19, 3, 32, 7, 4, 12, 36, 23, 0, 33, 20, 11, 13, 18, 21, 15, 35, 34, 8, 1, 25, 14, 16, 6, 9};
                    ArrayList arrayList2 = new ArrayList();
                    for (int i11 = 0; i11 < 30; i11++) {
                        int i12 = iArr2[i11];
                        hasCapability = networkRequest.hasCapability(i12);
                        if (hasCapability) {
                            arrayList2.add(Integer.valueOf(i12));
                        }
                    }
                    y11 = CollectionsKt.y(arrayList2);
                }
                objectOutputStream.writeInt(y10.length);
                for (int i13 : y10) {
                    objectOutputStream.writeInt(i13);
                }
                objectOutputStream.writeInt(y11.length);
                for (int i14 : y11) {
                    objectOutputStream.writeInt(i14);
                }
                objectOutputStream.close();
                byteArrayOutputStream.close();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                Intrinsics.delta(byteArray, "outputStream.toByteArray()");
                return byteArray;
            } finally {
            }
        } finally {
        }
    }

    public static final int charlie(int i4) {
        if (i4 == 0) {
            return 1;
        }
        if (i4 == 1) {
            return 2;
        }
        throw new IllegalArgumentException(av.q.delta(i4, "Could not convert ", " to BackoffPolicy"));
    }

    public static final int delta(int i4) {
        if (i4 == 0) {
            return 1;
        }
        if (i4 == 1) {
            return 2;
        }
        if (i4 == 2) {
            return 3;
        }
        if (i4 == 3) {
            return 4;
        }
        if (i4 == 4) {
            return 5;
        }
        if (Build.VERSION.SDK_INT >= 30 && i4 == 5) {
            return 6;
        }
        throw new IllegalArgumentException(av.q.delta(i4, "Could not convert ", " to NetworkType"));
    }

    public static final int echo(int i4) {
        if (i4 == 0) {
            return 1;
        }
        if (i4 == 1) {
            return 2;
        }
        throw new IllegalArgumentException(av.q.delta(i4, "Could not convert ", " to OutOfQuotaPolicy"));
    }

    public static final int foxtrot(int i4) {
        if (i4 == 0) {
            return 1;
        }
        if (i4 == 1) {
            return 2;
        }
        if (i4 == 2) {
            return 3;
        }
        if (i4 == 3) {
            return 4;
        }
        if (i4 == 4) {
            return 5;
        }
        if (i4 == 5) {
            return 6;
        }
        throw new IllegalArgumentException(av.q.delta(i4, "Could not convert ", " to State"));
    }

    public static final int golf(int i4) {
        com.google.android.material.datepicker.j.papa(i4, "networkType");
        int mike = av.q.mike(i4);
        if (mike != 0) {
            int i5 = 1;
            if (mike != 1) {
                i5 = 2;
                if (mike != 2) {
                    i5 = 3;
                    if (mike != 3) {
                        i5 = 4;
                        if (mike != 4) {
                            if (Build.VERSION.SDK_INT >= 30 && i4 == 6) {
                                return 5;
                            }
                            throw new IllegalArgumentException("Could not convert " + A0.z.quebec(i4) + " to int");
                        }
                    }
                }
            }
            return i5;
        }
        return 0;
    }

    public static final byte[] hotel(Set triggers) {
        Intrinsics.echo(triggers, "triggers");
        if (triggers.isEmpty()) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                objectOutputStream.writeInt(triggers.size());
                Iterator it = triggers.iterator();
                while (it.hasNext()) {
                    A2.c cVar = (A2.c) it.next();
                    objectOutputStream.writeUTF(cVar.alpha.toString());
                    objectOutputStream.writeBoolean(cVar.bravo);
                }
                objectOutputStream.close();
                byteArrayOutputStream.close();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                Intrinsics.delta(byteArray, "outputStream.toByteArray()");
                return byteArray;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AbstractC2716m6.alpha(objectOutputStream, th);
                    throw th2;
                }
            }
        } finally {
        }
    }

    public static void india(Drawable drawable, int i4) {
        drawable.setTint(i4);
    }

    public static final int juliet(int i4) {
        com.google.android.material.datepicker.j.papa(i4, "state");
        int mike = av.q.mike(i4);
        if (mike != 0) {
            int i5 = 1;
            if (mike != 1) {
                i5 = 2;
                if (mike != 2) {
                    i5 = 3;
                    if (mike != 3) {
                        i5 = 4;
                        if (mike != 4) {
                            if (mike == 5) {
                                return 5;
                            }
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                }
            }
            return i5;
        }
        return 0;
    }

    public static final K2.e kilo(byte[] bytes) {
        Intrinsics.echo(bytes, "bytes");
        if (Build.VERSION.SDK_INT >= 28 && bytes.length != 0) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    int readInt = objectInputStream.readInt();
                    int[] iArr = new int[readInt];
                    for (int i4 = 0; i4 < readInt; i4++) {
                        iArr[i4] = objectInputStream.readInt();
                    }
                    int readInt2 = objectInputStream.readInt();
                    int[] iArr2 = new int[readInt2];
                    for (int i5 = 0; i5 < readInt2; i5++) {
                        iArr2[i5] = objectInputStream.readInt();
                    }
                    K2.e charlie = K2.f.charlie(iArr2, iArr);
                    objectInputStream.close();
                    byteArrayInputStream.close();
                    return charlie;
                } finally {
                }
            } finally {
            }
        } else {
            return new K2.e(null);
        }
    }
}

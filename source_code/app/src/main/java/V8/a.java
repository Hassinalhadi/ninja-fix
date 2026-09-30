package V8;

import A2.j;
import A2.k;
import A2.z;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import androidx.core.content.FileProvider;
import ao.ad;
import ge.InterfaceC1772d;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileAttribute;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.v;
import s6.AbstractC2707l6;

/* loaded from: classes2.dex */
public abstract class a {
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Double[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Float[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Long[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Integer[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Boolean[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.String[], java.io.Serializable] */
    public static final Serializable alpha(DataInputStream dataInputStream, byte b2) {
        if (b2 == 0) {
            return null;
        }
        if (b2 == 1) {
            return Boolean.valueOf(dataInputStream.readBoolean());
        }
        if (b2 == 2) {
            return Byte.valueOf(dataInputStream.readByte());
        }
        if (b2 == 3) {
            return Integer.valueOf(dataInputStream.readInt());
        }
        if (b2 == 4) {
            return Long.valueOf(dataInputStream.readLong());
        }
        if (b2 == 5) {
            return Float.valueOf(dataInputStream.readFloat());
        }
        if (b2 == 6) {
            return Double.valueOf(dataInputStream.readDouble());
        }
        if (b2 == 7) {
            return dataInputStream.readUTF();
        }
        int i4 = 0;
        if (b2 == 8) {
            int readInt = dataInputStream.readInt();
            ?? r02 = new Boolean[readInt];
            while (i4 < readInt) {
                r02[i4] = Boolean.valueOf(dataInputStream.readBoolean());
                i4++;
            }
            return r02;
        }
        if (b2 == 9) {
            int readInt2 = dataInputStream.readInt();
            ?? r03 = new Byte[readInt2];
            while (i4 < readInt2) {
                r03[i4] = Byte.valueOf(dataInputStream.readByte());
                i4++;
            }
            return r03;
        }
        if (b2 == 10) {
            int readInt3 = dataInputStream.readInt();
            ?? r04 = new Integer[readInt3];
            while (i4 < readInt3) {
                r04[i4] = Integer.valueOf(dataInputStream.readInt());
                i4++;
            }
            return r04;
        }
        if (b2 == 11) {
            int readInt4 = dataInputStream.readInt();
            ?? r05 = new Long[readInt4];
            while (i4 < readInt4) {
                r05[i4] = Long.valueOf(dataInputStream.readLong());
                i4++;
            }
            return r05;
        }
        if (b2 == 12) {
            int readInt5 = dataInputStream.readInt();
            ?? r06 = new Float[readInt5];
            while (i4 < readInt5) {
                r06[i4] = Float.valueOf(dataInputStream.readFloat());
                i4++;
            }
            return r06;
        }
        if (b2 == 13) {
            int readInt6 = dataInputStream.readInt();
            ?? r07 = new Double[readInt6];
            while (i4 < readInt6) {
                r07[i4] = Double.valueOf(dataInputStream.readDouble());
                i4++;
            }
            return r07;
        }
        if (b2 == 14) {
            int readInt7 = dataInputStream.readInt();
            ?? r12 = new String[readInt7];
            while (i4 < readInt7) {
                String readUTF = dataInputStream.readUTF();
                if (Intrinsics.areEqual(readUTF, "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d")) {
                    readUTF = null;
                }
                r12[i4] = readUTF;
                i4++;
            }
            return r12;
        }
        throw new IllegalStateException(ad.zulu(b2, "Unsupported type "));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ae A[Catch: all -> 0x0073, TryCatch #3 {all -> 0x0073, blocks: (B:17:0x0058, B:22:0x0087, B:24:0x00ae, B:25:0x00c9, B:31:0x00bb, B:33:0x00c6), top: B:11:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e7 A[Catch: Exception -> 0x0070, TRY_ENTER, TryCatch #1 {Exception -> 0x0070, blocks: (B:9:0x0029, B:18:0x0069, B:42:0x00f2, B:44:0x00f7, B:45:0x00fa, B:27:0x00e7, B:29:0x00ec), top: B:8:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ec A[Catch: Exception -> 0x0070, TryCatch #1 {Exception -> 0x0070, blocks: (B:9:0x0029, B:18:0x0069, B:42:0x00f2, B:44:0x00f7, B:45:0x00fa, B:27:0x00e7, B:29:0x00ec), top: B:8:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00bb A[Catch: all -> 0x0073, TryCatch #3 {all -> 0x0073, blocks: (B:17:0x0058, B:22:0x0087, B:24:0x00ae, B:25:0x00c9, B:31:0x00bb, B:33:0x00c6), top: B:11:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f2 A[Catch: Exception -> 0x0070, TryCatch #1 {Exception -> 0x0070, blocks: (B:9:0x0029, B:18:0x0069, B:42:0x00f2, B:44:0x00f7, B:45:0x00fa, B:27:0x00e7, B:29:0x00ec), top: B:8:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f7 A[Catch: Exception -> 0x0070, TryCatch #1 {Exception -> 0x0070, blocks: (B:9:0x0029, B:18:0x0069, B:42:0x00f2, B:44:0x00f7, B:45:0x00fa, B:27:0x00e7, B:29:0x00ec), top: B:8:0x0029 }] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Uri bravo(Context context, File file) {
        File externalCacheDir;
        OutputStream outputStream;
        FileOutputStream fileOutputStream;
        Exception e;
        Path path;
        String str = context.getPackageName() + ".cropper.fileprovider";
        try {
            Log.i("AIC", "Try get URI for scope storage - content://");
            Uri uriForFile = FileProvider.getUriForFile(context, str, file);
            Intrinsics.delta(uriForFile, "getUriForFile(context, authority, file)");
            return uriForFile;
        } catch (Exception e4) {
            try {
                Log.e("AIC", String.valueOf(e4.getMessage()));
                Log.w("AIC", "ANR Risk -- Copying the file the location cache to avoid 'external-files-path' bug for N+ devices");
                File file2 = new File(context.getCacheDir(), "CROP_LIB_CACHE");
                ?? name = file.getName();
                File file3 = new File(file2, (String) name);
                InputStream inputStream = null;
                try {
                    try {
                        name = new FileInputStream(file);
                    } catch (Throwable th) {
                        th = th;
                    }
                } catch (Exception e5) {
                    e = e5;
                    name = 0;
                    fileOutputStream = null;
                } catch (Throwable th2) {
                    th = th2;
                    outputStream = null;
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    throw th;
                }
                try {
                    fileOutputStream = new FileOutputStream(file3);
                    try {
                        AbstractC2707l6.echo(name, fileOutputStream);
                        Log.i("AIC", "Completed Android N+ file copy. Attempting to return the cached file");
                        Uri uriForFile2 = FileProvider.getUriForFile(context, str, file3);
                        Intrinsics.delta(uriForFile2, "getUriForFile(context, authority, cacheLocation)");
                        name.close();
                        fileOutputStream.close();
                        return uriForFile2;
                    } catch (Exception e10) {
                        e = e10;
                        Log.e("AIC", String.valueOf(e.getMessage()));
                        Log.i("AIC", "Trying to provide URI manually");
                        String str2 = "content://" + str + "/files/my_images/";
                        if (Build.VERSION.SDK_INT < 26) {
                            path = Paths.get(str2, new String[0]);
                            Files.createDirectories(path, new FileAttribute[0]);
                        } else {
                            File file4 = new File(str2);
                            if (!file4.exists()) {
                                file4.mkdirs();
                            }
                        }
                        Uri parse = Uri.parse(str2 + file.getName());
                        Intrinsics.delta(parse, "parse(\"$path${file.name}\")");
                        if (name != 0) {
                            name.close();
                        }
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                        return parse;
                    }
                } catch (Exception e11) {
                    e = e11;
                    fileOutputStream = null;
                    name = name;
                    e = e;
                    Log.e("AIC", String.valueOf(e.getMessage()));
                    Log.i("AIC", "Trying to provide URI manually");
                    String str22 = "content://" + str + "/files/my_images/";
                    if (Build.VERSION.SDK_INT < 26) {
                    }
                    Uri parse2 = Uri.parse(str22 + file.getName());
                    Intrinsics.delta(parse2, "parse(\"$path${file.name}\")");
                    if (name != 0) {
                    }
                    if (fileOutputStream != null) {
                    }
                    return parse2;
                } catch (Throwable th3) {
                    th = th3;
                    outputStream = null;
                    inputStream = name;
                    if (inputStream != null) {
                    }
                    if (outputStream != null) {
                    }
                    throw th;
                }
            } catch (Exception e12) {
                Log.e("AIC", String.valueOf(e12.getMessage()));
                if (Build.VERSION.SDK_INT < 29 && (externalCacheDir = context.getExternalCacheDir()) != null) {
                    try {
                        Log.i("AIC", "Use External storage, do not work for OS 29 and above");
                        Uri fromFile = Uri.fromFile(new File(externalCacheDir.getPath(), file.getAbsolutePath()));
                        Intrinsics.delta(fromFile, "fromFile(File(cacheDir.path, file.absolutePath))");
                        return fromFile;
                    } catch (Exception e13) {
                        Log.e("AIC", String.valueOf(e13.getMessage()));
                        Log.i("AIC", "Try get URI using file://");
                        Uri fromFile2 = Uri.fromFile(file);
                        Intrinsics.delta(fromFile2, "fromFile(file)");
                        return fromFile2;
                    }
                }
                Log.i("AIC", "Try get URI using file://");
                Uri fromFile22 = Uri.fromFile(file);
                Intrinsics.delta(fromFile22, "fromFile(file)");
                return fromFile22;
            }
        }
    }

    public static byte[] charlie(j data) {
        Intrinsics.echo(data, "data");
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            try {
                dataOutputStream.writeShort(-21521);
                dataOutputStream.writeShort(1);
                HashMap hashMap = data.alpha;
                dataOutputStream.writeInt(hashMap.size());
                for (Map.Entry entry : hashMap.entrySet()) {
                    delta(dataOutputStream, (String) entry.getKey(), entry.getValue());
                }
                dataOutputStream.flush();
                if (dataOutputStream.size() <= 10240) {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    dataOutputStream.close();
                    Intrinsics.delta(byteArray, "{\n                ByteAr…          }\n            }");
                    return byteArray;
                }
                throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
            } finally {
            }
        } catch (IOException e) {
            z.echo().delta(k.alpha, "Error in Data#toByteArray: ", e);
            return new byte[0];
        }
    }

    public static final void delta(DataOutputStream dataOutputStream, String str, Object obj) {
        int i4;
        double d4;
        float f5;
        long j5;
        int i5;
        byte b2;
        boolean z2;
        if (obj == null) {
            dataOutputStream.writeByte(0);
        } else if (obj instanceof Boolean) {
            dataOutputStream.writeByte(1);
            dataOutputStream.writeBoolean(((Boolean) obj).booleanValue());
        } else if (obj instanceof Byte) {
            dataOutputStream.writeByte(2);
            dataOutputStream.writeByte(((Number) obj).byteValue());
        } else if (obj instanceof Integer) {
            dataOutputStream.writeByte(3);
            dataOutputStream.writeInt(((Number) obj).intValue());
        } else if (obj instanceof Long) {
            dataOutputStream.writeByte(4);
            dataOutputStream.writeLong(((Number) obj).longValue());
        } else if (obj instanceof Float) {
            dataOutputStream.writeByte(5);
            dataOutputStream.writeFloat(((Number) obj).floatValue());
        } else if (obj instanceof Double) {
            dataOutputStream.writeByte(6);
            dataOutputStream.writeDouble(((Number) obj).doubleValue());
        } else if (obj instanceof String) {
            dataOutputStream.writeByte(7);
            dataOutputStream.writeUTF((String) obj);
        } else if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            Class<?> cls = objArr.getClass();
            v vVar = u.alpha;
            InterfaceC1772d bravo = vVar.bravo(cls);
            if (Intrinsics.areEqual(bravo, vVar.bravo(Boolean[].class))) {
                i4 = 8;
            } else if (Intrinsics.areEqual(bravo, vVar.bravo(Byte[].class))) {
                i4 = 9;
            } else if (Intrinsics.areEqual(bravo, vVar.bravo(Integer[].class))) {
                i4 = 10;
            } else if (Intrinsics.areEqual(bravo, vVar.bravo(Long[].class))) {
                i4 = 11;
            } else if (Intrinsics.areEqual(bravo, vVar.bravo(Float[].class))) {
                i4 = 12;
            } else if (Intrinsics.areEqual(bravo, vVar.bravo(Double[].class))) {
                i4 = 13;
            } else if (Intrinsics.areEqual(bravo, vVar.bravo(String[].class))) {
                i4 = 14;
            } else {
                throw new IllegalArgumentException("Unsupported value type " + vVar.bravo(objArr.getClass()).juliet());
            }
            dataOutputStream.writeByte(i4);
            dataOutputStream.writeInt(objArr.length);
            for (Object obj2 : objArr) {
                String str2 = null;
                Boolean bool = null;
                Byte b4 = null;
                Integer num = null;
                Long l10 = null;
                Float f10 = null;
                Double d9 = null;
                if (i4 == 8) {
                    if (obj2 instanceof Boolean) {
                        bool = (Boolean) obj2;
                    }
                    if (bool != null) {
                        z2 = bool.booleanValue();
                    } else {
                        z2 = false;
                    }
                    dataOutputStream.writeBoolean(z2);
                } else if (i4 == 9) {
                    if (obj2 instanceof Byte) {
                        b4 = (Byte) obj2;
                    }
                    if (b4 != null) {
                        b2 = b4.byteValue();
                    } else {
                        b2 = 0;
                    }
                    dataOutputStream.writeByte(b2);
                } else if (i4 == 10) {
                    if (obj2 instanceof Integer) {
                        num = (Integer) obj2;
                    }
                    if (num != null) {
                        i5 = num.intValue();
                    } else {
                        i5 = 0;
                    }
                    dataOutputStream.writeInt(i5);
                } else if (i4 == 11) {
                    if (obj2 instanceof Long) {
                        l10 = (Long) obj2;
                    }
                    if (l10 != null) {
                        j5 = l10.longValue();
                    } else {
                        j5 = 0;
                    }
                    dataOutputStream.writeLong(j5);
                } else if (i4 == 12) {
                    if (obj2 instanceof Float) {
                        f10 = (Float) obj2;
                    }
                    if (f10 != null) {
                        f5 = f10.floatValue();
                    } else {
                        f5 = 0.0f;
                    }
                    dataOutputStream.writeFloat(f5);
                } else if (i4 == 13) {
                    if (obj2 instanceof Double) {
                        d9 = (Double) obj2;
                    }
                    if (d9 != null) {
                        d4 = d9.doubleValue();
                    } else {
                        d4 = 0.0d;
                    }
                    dataOutputStream.writeDouble(d4);
                } else if (i4 == 14) {
                    if (obj2 instanceof String) {
                        str2 = (String) obj2;
                    }
                    if (str2 == null) {
                        str2 = "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d";
                    }
                    dataOutputStream.writeUTF(str2);
                }
            }
        } else {
            throw new IllegalArgumentException("Unsupported value type " + u.alpha.bravo(obj.getClass()).kilo());
        }
        dataOutputStream.writeUTF(str);
    }
}

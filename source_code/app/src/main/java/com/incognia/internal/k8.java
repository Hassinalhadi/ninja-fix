package com.incognia.internal;

import android.os.Environment;
import android.os.StatFs;
import com.google.android.gms.common.c;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

/* loaded from: classes2.dex */
public final class k8 {
    public static Boolean J() {
        try {
            return Boolean.valueOf(Environment.isExternalStorageEmulated());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Long W() {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            return Long.valueOf(statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Boolean b() {
        if (CnH.b(CnH.f8484b, 0, 28, 1)) {
            try {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(Environment.getExternalStorageDirectory().toString());
                char c3 = File.separatorChar;
                sb2.append(c3);
                sb2.append((String) wGk.yol.getValue());
                sb2.append(c3);
                sb2.append((String) wGk.CWj.getValue());
                return Boolean.valueOf(new File(sb2.toString()).exists());
            } catch (Throwable unused) {
                return null;
            }
        }
        return null;
    }

    public static Long f9() {
        Path path;
        BasicFileAttributes readAttributes;
        FileTime creationTime;
        long millis;
        if (CnH.b(CnH.f8484b, 26, 0, 2)) {
            try {
                path = Paths.get(Environment.getDownloadCacheDirectory().getPath(), new String[0]);
                readAttributes = Files.readAttributes(path, (Class<BasicFileAttributes>) c.india(), new LinkOption[0]);
                creationTime = readAttributes.creationTime();
                if (creationTime != null) {
                    millis = creationTime.toMillis();
                    return Long.valueOf(millis);
                }
                return null;
            } catch (Throwable unused) {
                return null;
            }
        }
        return null;
    }

    public static Long gmP() {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            return Long.valueOf(statFs.getBlockCountLong() * statFs.getBlockSizeLong());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Long sVU() {
        Path path;
        BasicFileAttributes readAttributes;
        FileTime creationTime;
        long millis;
        if (CnH.b(CnH.f8484b, 26, 0, 2)) {
            try {
                path = Paths.get(Environment.getExternalStorageDirectory().getPath(), new String[0]);
                readAttributes = Files.readAttributes(path, (Class<BasicFileAttributes>) c.india(), new LinkOption[0]);
                creationTime = readAttributes.creationTime();
                if (creationTime != null) {
                    millis = creationTime.toMillis();
                    return Long.valueOf(millis);
                }
                return null;
            } catch (Throwable unused) {
                return null;
            }
        }
        return null;
    }
}

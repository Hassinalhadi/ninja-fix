package zendesk.core;

import Q0.c;
import android.content.Context;
import android.database.Cursor;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.webkit.MimeTypeMap;
import androidx.appcompat.widget.P0;
import androidx.core.content.FileProvider;
import ao.ad;
import av.q;
import com.clevertap.android.sdk.variables.CTVariableUtils;
import com.google.android.material.datepicker.j;
import com.zendesk.logger.Logger;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.UUID;

/* loaded from: classes.dex */
public class MediaFileResolver {
    private static final String ATTACHMENT_NAME = "attachment_%s";
    private static final String CAMERA_DATETIME_STRING_FORMAT = "yyyyMMddHHmmssSSS";
    private static final String CAMERA_IMG_NAME = "camera_image_%s";
    private static final String CAMERA_IMG_SUFFIX = ".jpg";
    private static final String FILE_DIR_MEDIA = "media";
    private static final String FILE_DIR_USER = "user";
    private static final String FILE_DIR_USER_MEDIA = "zendesk-user-media-data";
    private static final String LOG_TAG = "MediaFileUtility";
    private static final String MEDIA_FILE_PROVIDER_AUTHORITY_SUFFIX = ".zendesk.sdk.user.attachments";
    private static final String MEDIA_FORMATTED_BASE_PATH;
    private static final String PATH_PLACEHOLDER = "%s%s%s";
    private static final String REQUEST_FORMATTED_MEDIA_PATH;
    private final Context context;

    static {
        Locale locale = Locale.US;
        String str = File.separator;
        String gray = ad.gray("zendesk", str, "support");
        MEDIA_FORMATTED_BASE_PATH = gray;
        REQUEST_FORMATTED_MEDIA_PATH = ad.amber(gray, str, "request");
    }

    public MediaFileResolver(Context context) {
        this.context = context;
    }

    private void clearDirectory(File file) {
        if (file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                clearDirectory(file2);
            }
        }
        file.delete();
    }

    private File createTempFile(File file, String str, String str2) {
        StringBuilder tango = c.tango(str);
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        tango.append(str2);
        return new File(file, tango.toString());
    }

    private File getAttachmentDir(String str) {
        String str2;
        if (!TextUtils.isEmpty(str)) {
            StringBuilder tango = c.tango(str);
            tango.append(File.separator);
            str2 = tango.toString();
        } else {
            str2 = "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getRootDir(this.context));
        String str3 = File.separator;
        File file = new File(j.lima(sb2, str3, FILE_DIR_USER_MEDIA, str3, str2));
        if (!file.isDirectory()) {
            file.mkdirs();
        }
        if (file.isDirectory()) {
            return file;
        }
        return null;
    }

    private String getExtension(Uri uri, boolean z2) {
        String str;
        String lastPathSegment;
        int lastIndexOf;
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        String scheme = uri.getScheme();
        if (com.clevertap.android.sdk.Constants.KEY_CONTENT.equals(scheme)) {
            str = singleton.getExtensionFromMimeType(this.context.getContentResolver().getType(uri));
        } else if (CTVariableUtils.FILE.equals(scheme) && (lastIndexOf = (lastPathSegment = uri.getLastPathSegment()).lastIndexOf(".")) != -1) {
            str = lastPathSegment.substring(lastIndexOf + 1, lastPathSegment.length());
        } else {
            str = "tmp";
        }
        if (z2) {
            Locale locale = Locale.US;
            return q.echo(".", str);
        }
        return str;
    }

    private String getFileNameFromUri(Uri uri) {
        String scheme = uri.getScheme();
        String str = "";
        if (com.clevertap.android.sdk.Constants.KEY_CONTENT.equals(scheme)) {
            Cursor query = this.context.getContentResolver().query(uri, new String[]{"_display_name"}, null, null, null);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        str = query.getString(0);
                    }
                    return str;
                } finally {
                    query.close();
                }
            }
        } else if (CTVariableUtils.FILE.equals(scheme)) {
            return uri.getLastPathSegment();
        }
        return "";
    }

    private String getRootDir(Context context) {
        return context.getCacheDir().getAbsolutePath();
    }

    public void clearStorage() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getRootDir(this.context));
        File file = new File(P0.gold(sb2, File.separator, FILE_DIR_USER_MEDIA));
        if (file.isDirectory()) {
            clearDirectory(file);
        }
    }

    public File createCacheFile(String str, String str2) {
        boolean isEmpty = TextUtils.isEmpty(str);
        String str3 = FILE_DIR_USER;
        if (!isEmpty) {
            str3 = P0.gold(new StringBuilder(FILE_DIR_USER), File.separator, str);
        }
        File attachmentDir = getAttachmentDir(str3);
        if (attachmentDir == null) {
            Log.w(LOG_TAG, "Error creating cache directory");
            return null;
        }
        return createTempFile(attachmentDir, str2, null);
    }

    public String createTakenPictureFileName() {
        return ("camera_image_" + new SimpleDateFormat(CAMERA_DATETIME_STRING_FORMAT, Locale.US).format(new Date(System.currentTimeMillis()))).concat(CAMERA_IMG_SUFFIX);
    }

    public Uri createUriToSaveTakenPicture() {
        return getFileProviderUri(this.context, createCacheFile(getTemporaryRequestCacheDir(), createTakenPictureFileName()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v16 */
    public List<File> fetchFilesFromUris(List<Uri> list) {
        Throwable th;
        boolean z2;
        boolean z10;
        boolean z11;
        ?? r22 = 1;
        ArrayList arrayList = new ArrayList();
        byte[] bArr = new byte[1048576];
        String str = null;
        InputStream inputStream = null;
        FileOutputStream fileOutputStream = null;
        for (Uri uri : list) {
            try {
                try {
                    inputStream = this.context.getContentResolver().openInputStream(uri);
                    File fileForUri = getFileForUri(uri, str);
                    if (inputStream != null && fileForUri != null) {
                        Locale locale = Locale.US;
                        Object[] objArr = new Object[2];
                        objArr[0] = uri;
                        objArr[r22] = fileForUri;
                        Logger.d(LOG_TAG, String.format(locale, "Copying media file into private cache - Uri: %s - Dest: %s", objArr), new Object[0]);
                        FileOutputStream fileOutputStream2 = new FileOutputStream(fileForUri);
                        while (true) {
                            try {
                                int read = inputStream.read(bArr);
                                if (read <= 0) {
                                    break;
                                }
                                fileOutputStream2.write(bArr, 0, read);
                            } catch (FileNotFoundException e) {
                                e = e;
                                fileOutputStream = fileOutputStream2;
                                z2 = true;
                                Logger.e(LOG_TAG, String.format(Locale.US, "File not found error copying file, uri: %s", uri), e, new Object[0]);
                                if (inputStream != null) {
                                    try {
                                        inputStream.close();
                                    } catch (IOException e4) {
                                        Logger.e(LOG_TAG, "Error closing InputStream", e4, new Object[0]);
                                    }
                                }
                                if (fileOutputStream != null) {
                                    try {
                                        fileOutputStream.close();
                                    } catch (IOException e5) {
                                        Logger.e(LOG_TAG, "Error closing FileOutputStream", e5, new Object[0]);
                                    }
                                }
                                r22 = z2;
                                str = null;
                            } catch (IOException e10) {
                                e = e10;
                                fileOutputStream = fileOutputStream2;
                                Logger.e(LOG_TAG, String.format(Locale.US, "IO Error copying file, uri: %s", uri), e, new Object[0]);
                                if (inputStream != null) {
                                    try {
                                        inputStream.close();
                                    } catch (IOException e11) {
                                        Logger.e(LOG_TAG, "Error closing InputStream", e11, new Object[0]);
                                    }
                                }
                                if (fileOutputStream != null) {
                                    try {
                                        fileOutputStream.close();
                                    } catch (IOException e12) {
                                        Logger.e(LOG_TAG, "Error closing FileOutputStream", e12, new Object[0]);
                                    }
                                }
                                z2 = true;
                                r22 = z2;
                                str = null;
                            } catch (IllegalStateException e13) {
                                e = e13;
                                fileOutputStream = fileOutputStream2;
                                Logger.e(LOG_TAG, String.format(Locale.US, "The file is either partially downloaded or corrupted, uri: %s", uri), e, new Object[0]);
                                if (inputStream != null) {
                                    try {
                                        inputStream.close();
                                    } catch (IOException e14) {
                                        Logger.e(LOG_TAG, "Error closing InputStream", e14, new Object[0]);
                                    }
                                }
                                if (fileOutputStream != null) {
                                    try {
                                        fileOutputStream.close();
                                    } catch (IOException e15) {
                                        Logger.e(LOG_TAG, "Error closing FileOutputStream", e15, new Object[0]);
                                    }
                                }
                                z2 = true;
                                r22 = z2;
                                str = null;
                            } catch (Throwable th2) {
                                th = th2;
                                fileOutputStream = fileOutputStream2;
                                if (inputStream != null) {
                                    try {
                                        inputStream.close();
                                    } catch (IOException e16) {
                                        Logger.e(LOG_TAG, "Error closing InputStream", e16, new Object[0]);
                                    }
                                }
                                if (fileOutputStream != null) {
                                    try {
                                        fileOutputStream.close();
                                        throw th;
                                    } catch (IOException e17) {
                                        Logger.e(LOG_TAG, "Error closing FileOutputStream", e17, new Object[0]);
                                        throw th;
                                    }
                                }
                                throw th;
                            }
                        }
                        fileOutputStream = fileOutputStream2;
                    } else {
                        Locale locale2 = Locale.US;
                        if (inputStream == null) {
                            z10 = r22;
                        } else {
                            z10 = false;
                        }
                        if (fileForUri == null) {
                            z11 = r22;
                        } else {
                            z11 = false;
                        }
                        Logger.w(LOG_TAG, "Unable to resolve uri. InputStream null = " + z10 + ", File null = " + z11, new Object[0]);
                    }
                    arrayList.add(fileForUri);
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException e18) {
                            Logger.e(LOG_TAG, "Error closing InputStream", e18, new Object[0]);
                        }
                    }
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e19) {
                            Logger.e(LOG_TAG, "Error closing FileOutputStream", e19, new Object[0]);
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (FileNotFoundException e20) {
                e = e20;
            } catch (IOException e21) {
                e = e21;
            } catch (IllegalStateException e22) {
                e = e22;
            }
            z2 = true;
            r22 = z2;
            str = null;
        }
        return arrayList;
    }

    public File getFileForUri(Uri uri, String str) {
        String str2;
        if (!TextUtils.isEmpty(str)) {
            str2 = P0.gold(new StringBuilder(FILE_DIR_USER), File.separator, str);
        } else {
            str2 = "media";
        }
        File attachmentDir = getAttachmentDir(str2);
        String str3 = null;
        if (attachmentDir == null) {
            Log.w(LOG_TAG, "Error creating cache directory");
            return null;
        }
        String fileNameFromUri = getFileNameFromUri(uri);
        if (TextUtils.isEmpty(fileNameFromUri)) {
            fileNameFromUri = q.echo("attachment_", new SimpleDateFormat(CAMERA_DATETIME_STRING_FORMAT, Locale.US).format(new Date(System.currentTimeMillis())));
            str3 = getExtension(uri, true);
        }
        return createTempFile(attachmentDir, fileNameFromUri, str3);
    }

    public String getFileProviderAuthority(Context context) {
        Locale locale = Locale.US;
        return P0.crimson(context.getPackageName(), MEDIA_FILE_PROVIDER_AUTHORITY_SUFFIX);
    }

    public Uri getFileProviderUri(Context context, File file) {
        String fileProviderAuthority = getFileProviderAuthority(context);
        try {
            return FileProvider.getUriForFile(context, fileProviderAuthority, file);
        } catch (IllegalArgumentException unused) {
            Locale locale = Locale.US;
            Log.e(LOG_TAG, "The selected file can't be shared " + file.toString());
            return null;
        } catch (NullPointerException e) {
            Locale locale2 = Locale.US;
            String str = "=====================\nFileProvider failed to retrieve file uri. There might be an issue with the FileProvider \nPlease make sure that manifest-merger is working, and that you have defined the applicationId (package name) in the build.gradle\nManifest merger: http://tools.android.com/tech-docs/new-build-system/user-guide/manifest-merger\nIf your are not able to use gradle or the manifest merger, please add the following to your AndroidManifest.xml:\n        <provider\n            android:name=\".MediaFileProvider\"\n            android:authorities=\"${applicationId}" + fileProviderAuthority + "\"\n            android:exported=\"false\"\n            android:grantUriPermissions=\"true\">\n            <meta-data\n                android:name=\"android.support.FILE_PROVIDER_PATHS\"\n                android:resource=\"@xml/zendesk_user_attachments\" />\n        </provider>\n=====================";
            Log.e(LOG_TAG, str, e);
            Log.e(LOG_TAG, str, e);
            throw new RuntimeException("Please specify your application id");
        }
    }

    public Pair<Integer, Integer> getImageDimensions(File file) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(file.getAbsolutePath(), options);
        return Pair.create(Integer.valueOf(options.outWidth), Integer.valueOf(options.outHeight));
    }

    public String getTemporaryRequestCacheDir() {
        Locale locale = Locale.US;
        return ad.amber(REQUEST_FORMATTED_MEDIA_PATH, File.separator, UUID.randomUUID().toString());
    }
}

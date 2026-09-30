package zendesk.core;

import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.util.Log;
import androidx.core.content.FileProvider;
import java.util.Arrays;

/* loaded from: classes.dex */
public class MediaFileProvider extends FileProvider {
    private static final String LOG_TAG = "MediaFileProvider";

    private String[] columnNamesWithData(String[] strArr) {
        for (String str : strArr) {
            if ("_data".equals(str)) {
                return strArr;
            }
        }
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length + 1);
        strArr2[strArr.length] = "_data";
        return strArr2;
    }

    @Override // androidx.core.content.FileProvider, android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        Cursor query = super.query(uri, strArr, str, strArr2, str2);
        if (query == null) {
            Log.w(LOG_TAG, "Not able to apply workaround, super.query(...) returned null");
            return null;
        }
        String[] columnNames = query.getColumnNames();
        MatrixCursor matrixCursor = new MatrixCursor(columnNamesWithData(columnNames), query.getCount());
        query.moveToPosition(-1);
        while (query.moveToNext()) {
            MatrixCursor.RowBuilder newRow = matrixCursor.newRow();
            for (int i4 = 0; i4 < columnNames.length; i4++) {
                newRow.add(query.getString(i4));
            }
        }
        query.close();
        return matrixCursor;
    }
}

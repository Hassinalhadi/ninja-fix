package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract;
import androidx.appcompat.widget.P0;
import java.io.FileNotFoundException;
import java.io.InputStream;

/* loaded from: classes3.dex */
public final class m extends b {
    public static final UriMatcher teal;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        teal = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "contacts/#/display_photo", 4);
        uriMatcher.addURI("com.android.contacts", "phone_lookup/*", 5);
    }

    @Override // com.bumptech.glide.load.data.e
    public final Class alpha() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.b
    public final void foxtrot(Object obj) {
        ((InputStream) obj).close();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025 A[RETURN] */
    @Override // com.bumptech.glide.load.data.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object golf(ContentResolver contentResolver, Uri uri) {
        InputStream openContactPhotoInputStream;
        int match = teal.match(uri);
        if (match != 1) {
            if (match != 3) {
                if (match != 5) {
                    openContactPhotoInputStream = contentResolver.openInputStream(uri);
                }
            } else {
                openContactPhotoInputStream = ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri, true);
            }
            if (openContactPhotoInputStream == null) {
                return openContactPhotoInputStream;
            }
            throw new FileNotFoundException(P0.beige(uri, "InputStream is null for "));
        }
        Uri lookupContact = ContactsContract.Contacts.lookupContact(contentResolver, uri);
        if (lookupContact != null) {
            openContactPhotoInputStream = ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, lookupContact, true);
            if (openContactPhotoInputStream == null) {
            }
        } else {
            throw new FileNotFoundException("Contact cannot be found");
        }
    }
}

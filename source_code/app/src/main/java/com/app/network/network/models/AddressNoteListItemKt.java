package com.app.network.network.models;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"attachNoteNumbers", "", "notes", "", "Lcom/app/network/network/models/AddressNoteListItem;", "network_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AddressNoteListItemKt {
    public static final void attachNoteNumbers(@NotNull List<AddressNoteListItem> notes) {
        Intrinsics.echo(notes, "notes");
        int size = notes.size();
        int i4 = 0;
        for (Object obj : notes) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            AddressNoteListItem addressNoteListItem = (AddressNoteListItem) obj;
            addressNoteListItem.setNoteNumber(i5);
            addressNoteListItem.setTotalNotes(size);
            i4 = i5;
        }
    }
}

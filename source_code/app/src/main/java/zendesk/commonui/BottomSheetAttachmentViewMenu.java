package zendesk.commonui;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.clevertap.android.sdk.Constants;
import com.google.android.material.bottomsheet.l;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000f\u001a\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u000b¢\u0006\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015¨\u0006\u0019"}, d2 = {"Lzendesk/commonui/BottomSheetAttachmentViewMenu;", "Lcom/google/android/material/bottomsheet/l;", "Landroid/content/Context;", "context", "", "", "titles", "Lzendesk/commonui/BottomSheetAttachmentAction;", Constants.KEY_ACTION, "<init>", "(Landroid/content/Context;Ljava/util/List;Lzendesk/commonui/BottomSheetAttachmentAction;)V", "", "setupActionClickListener", "(Lzendesk/commonui/BottomSheetAttachmentAction;)V", "menuTitles", "setupMenuTitles", "(Ljava/util/List;)V", "showMenu", "()V", "Landroid/widget/TextView;", "takePhotoTextView", "Landroid/widget/TextView;", "mediaTextView", "documentTextView", "Companion", "common-ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BottomSheetAttachmentViewMenu extends l {
    public static final int CAMERA_MENU_ITEM_INDEX = 0;
    public static final int DOCUMENT_MENU_ITEM_INDEX = 2;
    public static final int GALLERY_MENU_ITEM_INDEX = 1;

    @Nullable
    private final TextView documentTextView;

    @Nullable
    private final TextView mediaTextView;

    @Nullable
    private final TextView takePhotoTextView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetAttachmentViewMenu(@NotNull Context context, @NotNull List<String> titles, @NotNull BottomSheetAttachmentAction action) {
        super(context);
        Intrinsics.echo(context, "context");
        Intrinsics.echo(titles, "titles");
        Intrinsics.echo(action, "action");
        setContentView(R.layout.zui_view_attachment_menu);
        this.takePhotoTextView = (TextView) findViewById(R.id.menu_item_camera);
        this.mediaTextView = (TextView) findViewById(R.id.menu_item_media);
        this.documentTextView = (TextView) findViewById(R.id.menu_item_document);
        setupMenuTitles(titles);
        setupActionClickListener(action);
        setCancelable(true);
    }

    private final void setupActionClickListener(final BottomSheetAttachmentAction action) {
        TextView textView = this.takePhotoTextView;
        if (textView != null) {
            final int i4 = 0;
            textView.setOnClickListener(new View.OnClickListener() { // from class: zendesk.commonui.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i4) {
                        case 0:
                            BottomSheetAttachmentViewMenu.setupActionClickListener$lambda$0(action, this, view);
                            return;
                        case 1:
                            BottomSheetAttachmentViewMenu.setupActionClickListener$lambda$1(action, this, view);
                            return;
                        default:
                            BottomSheetAttachmentViewMenu.setupActionClickListener$lambda$2(action, this, view);
                            return;
                    }
                }
            });
        }
        TextView textView2 = this.mediaTextView;
        if (textView2 != null) {
            final int i5 = 1;
            textView2.setOnClickListener(new View.OnClickListener() { // from class: zendesk.commonui.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i5) {
                        case 0:
                            BottomSheetAttachmentViewMenu.setupActionClickListener$lambda$0(action, this, view);
                            return;
                        case 1:
                            BottomSheetAttachmentViewMenu.setupActionClickListener$lambda$1(action, this, view);
                            return;
                        default:
                            BottomSheetAttachmentViewMenu.setupActionClickListener$lambda$2(action, this, view);
                            return;
                    }
                }
            });
        }
        TextView textView3 = this.documentTextView;
        if (textView3 != null) {
            final int i10 = 2;
            textView3.setOnClickListener(new View.OnClickListener() { // from class: zendesk.commonui.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            BottomSheetAttachmentViewMenu.setupActionClickListener$lambda$0(action, this, view);
                            return;
                        case 1:
                            BottomSheetAttachmentViewMenu.setupActionClickListener$lambda$1(action, this, view);
                            return;
                        default:
                            BottomSheetAttachmentViewMenu.setupActionClickListener$lambda$2(action, this, view);
                            return;
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupActionClickListener$lambda$0(BottomSheetAttachmentAction action, BottomSheetAttachmentViewMenu this$0, View view) {
        Intrinsics.echo(action, "$action");
        Intrinsics.echo(this$0, "this$0");
        action.onTakePhotoClicked();
        this$0.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupActionClickListener$lambda$1(BottomSheetAttachmentAction action, BottomSheetAttachmentViewMenu this$0, View view) {
        Intrinsics.echo(action, "$action");
        Intrinsics.echo(this$0, "this$0");
        action.onSelectMediaClicked();
        this$0.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupActionClickListener$lambda$2(BottomSheetAttachmentAction action, BottomSheetAttachmentViewMenu this$0, View view) {
        Intrinsics.echo(action, "$action");
        Intrinsics.echo(this$0, "this$0");
        action.onSelectDocumentClicked();
        this$0.dismiss();
    }

    private final void setupMenuTitles(List<String> menuTitles) {
        TextView textView;
        TextView textView2;
        TextView textView3;
        String str = (String) CollectionsKt.jade(0, menuTitles);
        if (str != null && (textView3 = this.takePhotoTextView) != null) {
            textView3.setText(str);
        }
        String str2 = (String) CollectionsKt.jade(1, menuTitles);
        if (str2 != null && (textView2 = this.mediaTextView) != null) {
            textView2.setText(str2);
        }
        String str3 = (String) CollectionsKt.jade(2, menuTitles);
        if (str3 != null && (textView = this.documentTextView) != null) {
            textView.setText(str3);
        }
    }

    public final void showMenu() {
        if (!isShowing()) {
            show();
        }
    }
}

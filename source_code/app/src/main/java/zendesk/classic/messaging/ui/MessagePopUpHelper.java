package zendesk.classic.messaging.ui;

import an.i;
import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.C0481t0;
import androidx.appcompat.widget.InterfaceC0479s0;
import ao.l;
import ao.v;
import java.util.Set;
import zendesk.classic.messaging.R;

/* loaded from: classes.dex */
class MessagePopUpHelper {
    private static final int COPY_MENU_ITEM_INDEX = 0;
    private static final int DELETE_MENU_ITEM_INDEX = 2;
    private static final int RETRY_MENU_ITEM_INDEX = 1;

    /* loaded from: classes.dex */
    public enum Option {
        COPY,
        RETRY,
        DELETE
    }

    private static InterfaceC0479s0 createOnMenuItemClickListener(final MessageActionListener messageActionListener, final String str) {
        if (messageActionListener == null) {
            return null;
        }
        return new InterfaceC0479s0() { // from class: zendesk.classic.messaging.ui.MessagePopUpHelper.1
            @Override // androidx.appcompat.widget.InterfaceC0479s0
            public boolean onMenuItemClick(MenuItem menuItem) {
                if (menuItem.getItemId() == R.id.zui_failed_message_retry) {
                    MessageActionListener.this.retry(str);
                    return true;
                }
                if (menuItem.getItemId() == R.id.zui_failed_message_delete) {
                    MessageActionListener.this.delete(str);
                    return true;
                }
                if (menuItem.getItemId() == R.id.zui_message_copy) {
                    MessageActionListener.this.copy(str);
                    return true;
                }
                return false;
            }
        };
    }

    private static C0481t0 createPopUpMenu(View view, int i4, InterfaceC0479s0 interfaceC0479s0) {
        Context context = view.getContext();
        C0481t0 c0481t0 = new C0481t0(context, view);
        new i(context).inflate(i4, c0481t0.alpha);
        c0481t0.delta = interfaceC0479s0;
        c0481t0.charlie.foxtrot = 8388613;
        return c0481t0;
    }

    public static void showPopUpMenu(View view, Set<Option> set, MessageActionListener messageActionListener, String str) {
        C0481t0 createPopUpMenu = createPopUpMenu(view, R.menu.zui_message_options_copy_retry_delete, createOnMenuItemClickListener(messageActionListener, str));
        createPopUpMenu.alpha.getItem(0).setVisible(set.contains(Option.COPY));
        l lVar = createPopUpMenu.alpha;
        lVar.getItem(1).setVisible(set.contains(Option.RETRY));
        lVar.getItem(2).setVisible(set.contains(Option.DELETE));
        v vVar = createPopUpMenu.charlie;
        if (vVar.bravo()) {
            return;
        }
        if (vVar.echo != null) {
            vVar.delta(0, 0, false, false);
            return;
        }
        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
    }
}

package zendesk.classic.messaging;

import java.util.List;
import zendesk.classic.messaging.Engine;
import zendesk.configurations.Configuration;

/* loaded from: classes.dex */
public interface MessagingApi {
    AgentDetails getBotAgentDetails();

    List<Configuration> getConfigurations();

    ConversationLog getConversationLog();

    List<Engine.TransferOptionDescription> getTransferOptionDescriptions();
}

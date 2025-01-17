import com.liferay.headless.delivery.client.dto.v1_0.MessageBoardMessage;
import com.liferay.headless.delivery.client.pagination.Page;
import com.liferay.headless.delivery.client.pagination.Pagination;
import com.liferay.headless.delivery.client.resource.v1_0.MessageBoardMessageResource;

public class MessageBoardMessages_GET_FromThread {

	/**
	 * java -classpath .:* -DmessageBoardThreadId=1234 MessageBoardMessages_GET_FromThread
	 */
	public static void main(String[] args) throws Exception {
		MessageBoardMessageResource.Builder builder =
			MessageBoardMessageResource.builder();

		MessageBoardMessageResource messageBoardMessageResource =
			builder.authentication(
				"test@liferay.com", "learn"
			).build();

		Page<MessageBoardMessage> page =
			messageBoardMessageResource.
				getMessageBoardThreadMessageBoardMessagesPage(
					Long.valueOf(System.getProperty("messageBoardThreadId")),
					null, null, null, Pagination.of(1, 2), null);

		System.out.println(page);
	}

}
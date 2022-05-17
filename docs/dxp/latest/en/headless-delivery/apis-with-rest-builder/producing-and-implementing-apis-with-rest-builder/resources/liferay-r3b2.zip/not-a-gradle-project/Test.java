import com.liferay.headless.delivery.client.dto.v1_0.KnowledgeBaseFolder;
import com.liferay.headless.delivery.client.resource.v1_0.KnowledgeBaseFolderResource;

public class Test{

	public static void main(String[] args) throws Exception {
		/*
		FooResource.Builder builder = FooResource.builder();

		FooResource fooResource = builder.authentication(
			"test@liferay.com", "test"
		).build();

		//post
		Foo foo = fooResource.getFoo(1L);
		Foo foo3 = new Foo();
		foo3.setDescription("andre");
		foo3.setId(5L);
		foo3.setName("kkfsakfka");
		fooResource.postFoo(foo3);

		//put
		foo3.setName("modified");
		foo3.setDescription("andreModified");
		fooResource.putFoo(5L, foo3);
		System.out.println(foo3);


		//delete
		fooResource.deleteFoo(5L);
		System.out.println(foo3);
		 */

		KnowledgeBaseFolderResource.Builder builder = KnowledgeBaseFolderResource.builder();
		KnowledgeBaseFolderResource knowledgeBaseFolderResource = builder.authentication(
				"test@liferay.com", "test"
		).build();
		KnowledgeBaseFolder knowledgeBaseFolder = new KnowledgeBaseFolder();
		knowledgeBaseFolder.setName("Andre Felipe");

		long siteId = 20123;

		//POST
		KnowledgeBaseFolder KBFolderResponse = knowledgeBaseFolderResource.postSiteKnowledgeBaseFolder(siteId, knowledgeBaseFolder);
		long knowledgeBaseFolderId = KBFolderResponse.getId();


		// GET
		System.out.println(String.format("Folder Base: %s", knowledgeBaseFolderResource.getKnowledgeBaseFolder(knowledgeBaseFolderId)));

		// PATCH
		KnowledgeBaseFolder knowledgeBaseFolderPatch = knowledgeBaseFolderResource.getKnowledgeBaseFolder(knowledgeBaseFolderId);
		knowledgeBaseFolderPatch.setName("Andre modified");

		knowledgeBaseFolderResource.patchKnowledgeBaseFolder(knowledgeBaseFolderId, knowledgeBaseFolderPatch);

		//GET
		System.out.println(String.format("Folder Base: %s", knowledgeBaseFolderResource.getKnowledgeBaseFolder(knowledgeBaseFolderId)));

		//DELETE
		knowledgeBaseFolderResource.deleteKnowledgeBaseFolder(knowledgeBaseFolderId);

















	}

}
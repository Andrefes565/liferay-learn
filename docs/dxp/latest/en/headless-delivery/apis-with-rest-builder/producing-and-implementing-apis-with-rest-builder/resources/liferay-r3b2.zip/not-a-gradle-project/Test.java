import com.acme.headless.r3b2.client.dto.v1_0.Foo;
import com.acme.headless.r3b2.client.resource.v1_0.FooResource;

public class Test {

	public static void main(String[] args) throws Exception {
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


	}

}
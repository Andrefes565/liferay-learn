# アカウントロール

アカウントロールとは、アカウントのコンテキスト内でユーザーに特定の能力を与える権限のセットです。 これらのロールは、アカウントの責任を委任するために使用したり、Commerceサイトのロールと組み合わせて、ビジネスアカウントの完全な購入ワークフローを実装することができます。

```{note}
アカウントロールはLiferay 7.4で導入されました。 以前のバージョンでは、以下のロールがサイトロールとして表示されていました。 
```

Commerceには、すぐに使用できる2つのアカウントロールが含まれています：

***アカウント管理者** ：このロールを持つユーザーは、アカウントの編集、アカウントに参加するユーザーの招待、および他のアカウントメンバーにロールを割り当てることができます。 この役割には、すべてのバイヤーおよびオーダーマネージャーの権限も含まれます。

***［アカウントメンバー**］ : このロールは、アカウント内のすべてのユーザーに自動的に割り当てられ、基本的な表示権限が与えられます。 購入責任を委任するためのバイヤーまたはオーダーマネージャーの役割をメンバーに付与します。

  ***バイヤー**（サイトロール） ：この役割を持つユーザーは、注文を表示、作成、チェックアウトできます。

  ***オーダーマネージャー**（サイトロール） ：オーダーマネージャーはバイヤーのすべての権限を持ち、注文の管理、削除、承認もできます。

すぐに使えるロールや、自分のインスタンスに作成したい一般的なカスタムロールの一覧は、 [Commerceロールのリファレンス](../roles-and-permissions/commerce-roles-reference.md) を参照してください。

<a name="creating-account-roles" />

## アカウントロールの作成

既存のアカウントロールだけではビジネスニーズを満たせない場合、アカウントロールを追加で作成することができます。 また、既存のアカウントロールに権限を追加することもできます。 これは、他のタイプのDXPロールの作成・編集と同じプロセスです。

詳細は、 [ロールの作成と管理](https://learn.liferay.com/dxp/latest/ja/users-and-permissions/roles-and-permissions/creating-and-managing-roles.html) と [ロール権限の定義](https://learn.liferay.com/dxp/latest/ja/users-and-permissions/roles-and-permissions/defining-role-permissions.html) を参照してください。

<a name="liferay-73-and-earlier" />

## Liferay 7.3以前

### 売り手側のアカウント管理ロール

アカウントは、管理者と販売代理店でも管理できます。 Sales Agentを使用すると、ユーザーは管理者権限を付与せずにロールに割り当てられたアカウントを管理できます。

販売代理店にアカウントへのアクセスを許可するには：

1. アカウントウィジェットを使用して、組織をアカウントにグループ化します。
1. 同じ組織に販売代理店を関連付けます。

![販売代理店の役割を持つユーザーのリスト](./account-roles/images/01.png)

販売代理店は、関連する組織内のアカウントにアクセスできます。

<a name="additional-information" />

## 追加情報

* [アカウント管理](../account-management.md)
* [新規アカウントの作成](./creating-a-new-account.md)
* [新規アカウントグループの作成](./creating-a-new-account-group.md)
* [ロールと権限について](https://learn.liferay.com/dxp/latest/ja/users-and-permissions/roles-and-permissions/understanding-roles-and-permissions.html)

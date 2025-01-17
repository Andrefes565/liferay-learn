# 条件付きフィールドを使用したフォームの作成

フォームは、1つの質問に回答することで回答者が次の3つの質問をスキップできたり、回答者に追加の質問への回答を要求するなど、動的なフォームにすることができます。 このように、各フィールドは条件付きのフィールドにすることができます。 どのフィールドを条件付きにするかを決めたら、フォームルールを使って、その質問に対する回答に基づいて次のアクションを決定します（例えば、複数ページのフォームでは、3ページ目をスキップして4ページ目に進むなど）。

各フォームルールには、条件とアクションが含まれています。詳しくは、 [フォームルールの概要](../form-rules/form-rules-overview.md) を参照してください。

フォームルールを追加する前に、最初にすべてのフィールドを持つ[フォームを作成](./creating-forms.md)する必要があります。 （各項目タイプの詳細は、 [フォーム項目タイプのリファレンス](./forms-field-types-reference.md) を参照してください。） すべてのフィールドを作成したら、フォームルールを追加します。 フォームルールの一覧は以下のとおりです。

* [表示・非表示ルール](#show-hide-rule)
* [有効化・無効化ルール](#enable-disable-rule)
* [ページへ移動ルール](#jump-to-page-rule)
* [自動入力ルール](#autofill-rule)
* [必須ルール](#require-rule)
* [計算ルール](#calculate-rule)

<a name="show-hide-rule" />

## 表示・非表示ルール

回答者に追加の質問に答えてもらいたい場合は、 **表示・非表示** ルールを使用します。 例えば、キャンプの登録フォームには、キャンプ参加者が18歳以上であるかどうかという質問があります。 答えが ［**いいえ**］ の場合、フォームには保護者の名前を尋ねる追加フィールドが表示されます。 それ以外の場合、参加者が ［**はい**］ と答えた場合、保護者の名前を尋ねるフィールドは非表示になります。

詳しくは、 [表示/非表示ルールの使用](../form-rules/using-the-show-hide-rule.md) の記事を参照してください。

<a name="enable-disable-rule" />

## 有効化・無効化ルール

表示・非表示ルールと同様に、 **有効化・無効化** ルールは、1つまたは複数の条件に基づいてフィールドを編集可能にします。 任意の情報を入力したり、特定のグループに該当するユーザーのみからデータを収集する場合に便利です。 例えば、キャンプ場や病院では、治療に影響を与える可能性のある薬やアレルギーを記入してもらうことがあります。 このフィールドは、ユーザーが［はい］を選択した場合のみ編集可能です。

詳しくは、 [有効/無効ルールの使用](../form-rules/using-the-enable-disable-rule.md) の記事を参照してください。

<a name="jump-to-page-rule" />

## ページへ移動ルール

また、 **ページへ移動** のフォームルールを使用するというオプションもあります。 その名の通り、回答者は回答に応じてフォームの別のページにジャンプすることができます。 これは、フォームの一部のユーザーにだけ適用されるページがある場合に便利です。

詳しくは、[Using the Jump-to-Page Rule](../form-rules/using-the-jump-to-page-rule.md)の記事を参照してください。

<a name="autofill-rule" />

## 自動入力ルール

**自動入力** ルールは、事前に設定された条件に基づいて、フォーム項目のオプションを絞り込みます。 一般的な使い方としては、州や地方、国や都道府県を入力し、条件付きのフィルタを適用することが挙げられます。 例えば、回答者が地理的な地域（ヨーロッパ、北米、アジアなど）を選択した後、国（ドイツ、アメリカ、マレーシアなど）を選択する場合などです。 **自動入力** ルールを使用する前に、[データ プロバイダー](../data-providers/data-providers-overview.md)に接続する必要があります。 詳しくは、 [Using REST Data Provider to Populate Form Options](../data-providers/using-the-rest-data-provider-to-populate-form-options.md) をご覧ください。

<a name="require-rule" />

## 必須ルール

**必須** ルールを使用すると、1つまたは複数の条件に基づいてフィールドを必須にすることができます。 必須ルールは、 **表示** ルールのように、他のルールと関連して機能します。 例えば、レンタカーのフォームには、回答者がレンタカーに割引を適用するかどうかを記入するセクションがあります。 回答が ［**はい**］ の場合、回答者は割引を受けるためにプロモーションコードを入力する必要があります。

詳しくは、 [必須ルールの使用](../form-rules/using-the-require-rule.md) の記事を参照してください。

<a name="calculate-rule" />

## 計算ルール

他のフィールドに基づいて値を計算することで、数値フィールドを入力する **計算** フォーム ルールを作成します。 例えば、計算ルールでは、参加者数と登録料を掛け合わせることで（1人130ドル × 17人）、キャンプやカンファレンスの総登録料を算出することができます。

```{important}
   計算の対象となるのは数値フィールドに限られます。
```

詳しくは、 [計算ルールの使用](../form-rules/using-the-calculate-rule.md) の記事を参照してください。

<a name="additional-information" />

## 追加情報

* [フォームの作成](./creating-forms.md)
* [フォーム項目タイプのリファレンス](./forms-field-types-reference.md)
* [データプロバイダーの概要](../data-providers/data-providers-overview.md)

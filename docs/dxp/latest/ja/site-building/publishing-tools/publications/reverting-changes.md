# 変更を元に戻す

Liferay DXPのパブリケーションツールは、公開されたすべての変更の履歴を保持します。 この公開履歴を使用して、インスタンスへの以前の変更を元に戻すパブリケーションを作成できます。 変更を元に戻すときに、[元に戻す]パブリケーションの一部として、DXPインスタンスに追加の変更を加えることもできます。

1.  *[Publications]* 概要ページに移動して、*[履歴]* タブをクリックします。

    ![[Publications]概要ページに移動し、 [履歴]をクリックします。](./reverting-changes/images/01.png)

2.  元に戻すパブリケーションまたは復元の*[元に戻す]* をクリックします。

3.  *[Name]* フィールドを使用して、復元の名前を決定します。 パブリケーションを元に戻すためのデフォルト名は`Revert "[Publication Name]"`です。

4.  必要に応じて、復元の説明を入力します。

5.  *[Now]* または*[Later]* にかかわらず、復元をいつ公開するかを決定します。

    ![ [元に戻す]ページから、改訂履歴をいつ公開するかを決定できます。](./reverting-changes/images/02.png)

6.  *[公開を復元して作成]* をクリックします。

これにより、インスタンス全体で選択したパブリケーションによって行われたすべての変更を元に戻す変更を含む新しいパブリケーションが作成されますが、それらの変更が本番環境にすぐに適用されるわけではありません。

変更の復元を*今すぐ*公開することを選択した場合は、[公開]ページにリダイレクトされます。 競合がない場合は、*[公開]* をクリックして、元に戻す変更を公開できます。

元に戻す変更を*後で*公開することを選択した場合は、新しいパブリケーションの[変更の確認]ページにリダイレクトされます。 この時点で、パブリケーションにさらに変更を加え、準備ができたら元に戻す変更と新しい変更の両方を公開できます。

## 追加情報

  - [パブリケーションの作成と管理](./creating-and-managing-publications.md)
  - [変更の作成と公開](./making-and-publishing-changes.md)
  - [競合の解決](resolving-conflicts.md)

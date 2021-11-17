"https://atcoder.jp/contests/language-test-202001/tasks/practice_1
"3つの正整数 aa, bb, cc と文字列 ss が与えられます。 a+b+ca+b+c と ss
"を空白区切りで出力してください。
"【入力】
"a
"b c
"s
:delete a
:delete f
:delete s
"atCoderでは入力はファイルによって与えられるのでdeleteコマンドで上から一列ずつRegisterに格納している
"カーソルは一番上にある

"提出時はコメントも書けない

:let a = @a
:let b = split(@f)[0]
:let c = split(@f)[1]
:let s = @s

:put! = (a + b + c) . ' ' . s

"normal のJと同じで!をつけると空白をつけない
:join! 
:w
:q

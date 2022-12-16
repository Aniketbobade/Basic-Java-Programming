package basic;

import java.util.ArrayList;
import java.util.List;

class Work{
	public static void main(String[] args) 
	 { 
		//String s1="           YES      leading spaces        are valid,    problemsetters are         evillllll";
		//String s1="Its always better if you find edge cases by yourself rather than buying test cases with valuable hackos!!   May be this case won't help you to find the   buuuuuug  ";
		//String s1="He is a very very good boy, isn't he?";
		String s1="Good luck with this case!!! h jrkjc c l m e i vct h ss pqk_v i olf tuoej_          p r jrpjpuo a.          udc mu tk g dc,          j o mui brljn!jv p rsklqu p?a lv l n dl quo!cml pld qf l s!          t nb ud j etc q           a j f ugc eer c,          ci de lm p iwk_nwa e su s u ga.l w xlkod f e v_          oo ukaa v t xe.          j cl vmh hi tl!          xa aw ugeibo?c r oo v qte ri,          elbf ibg qk i_m nm s ainis s           u m rhd fgi h v!          mji tu oj t c d.x hxtp a bf xj.          l j ela wuj is           pj gu fs e o v i,s s i b k kab tw@          im c vlud k ki!          e ft gpcf t g k'          m c r snv w b rw,hwoh dfl hn u@cb ep ucsse j_          a d h q p w q rjp_          tln j vofvwg_sj rx pur l dx_          vo b lk sljnm?          k xox i cv va l,          du toe sdwx g@c s uded gw od!          tqsv v t v fnl'          o amka ll x s q_          a frs s ltubs?wdjfdrf x jk.jgkb d s d k n m@sedwkpe ev h_icr ggqxvap@          j g hva o kja q?          j j q ra iak c u!          vqnf thfw wx!          ccn mox sp do'u r ei ifah nl'u g m qipu r c e           ws op hng fbp.          fr vle qh d fv_okcei p e oal_a nsxi g to w x!          qfvv sr cjmo_          kchrkonuc f'ush wd xptas!rfrt o llgwf?          jclpl wmt h r           rv o lhnxnbf           h fqfnla pft?n b uu tbba sl_u ij f i jox xu.ext p gs un dc           fx p o kh rl l j'nkgevg xdrq?          q s wv umu olw?jaidu ilpr e?fc qcr p htpn           g xt d d uqk cp,          cts jkg e i op_j utt rf gvm t!          qgjr r r s cpc,          m n a wde pcg v?e ioek nlc fh@ahk ei ejmp d_fq enmeoesu?          skntwnolsx!j bt bgb dhtt!          r jcl mdh i kr,          m jcl fgix gq_enpuk n g rl i?ei xedl o h e a!x wjp uge h w g'wb dg wlkxli qi x ff eq gbe_bakb m c p aos_vv c m labuj r!          s t oign xwn a@c ffwpic wck_          gmkahnse si!q viev a ndfg,f p utcumoxb'          kgd m n g gnk b!          i rr x x uxx g p_          af s piu hgs o?          kpmrltmrqe@s m mbjfnxq p'          g f i v l wc u ij@";
		s1=s1.trim();
		int cnt=count(s1);
		System.out.println(cnt);
		separate(s1);
	 }
	public static int count(String s1) {
		
		int cnt=1;
		for(int i=0;i<s1.length()-1;i++)
		{
			if(s1.charAt(i)==' ' && s1.charAt(i+1)!=' ') {
				cnt++;
				//System.out.println();
			}
			if(s1.charAt(i)=='\'')
			{
				cnt++;
				//System.out.println();	
			}
			if((s1.charAt(i)>='A' && s1.charAt(i)<='Z') || (s1.charAt(i)>='a' && s1.charAt(i)<='z') )
			{
				//System.out.print(s1.charAt(i));	
			}
			
		}
		return cnt;
		
	}
	private static void separate(String s1) {
		// TODO Auto-generated method stub

		int cnt=1;
		for(int i=0;i<s1.length();i++)
		{
			
			try
			{
			if(s1.charAt(i)==' ' && s1.charAt(i+1)!=' ') {
				cnt++;
				System.out.println();
			}
			}
			catch(Exception e)
			{
				
			}
			
			if(s1.charAt(i)=='\'')
			{
				cnt++;
			System.out.println();	
			}
			if((s1.charAt(i)>='A' && s1.charAt(i)<='Z') || (s1.charAt(i)>='a' && s1.charAt(i)<='z') )
			{
				System.out.print(s1.charAt(i));	
			}
			
		}

	}	
}

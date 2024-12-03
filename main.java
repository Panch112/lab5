public class Fragment{
 private int LayoutType;
 private int FragmentWidth;
 private int FragmentHeight;
 private int ColumnsCount;
 private int LinesCount;
 private String TextColor;
 private String BackgroundColor;

 public Fragment(int LayoutType, int FragmentWidth, int FragmentHeigth, int ColumnsCount, int LinesCount, String TextColor, String BackgroundColor) {
 this.LayoutType = LayoutType;
 this.FragmentWidth = FragmentWidth;
 this.FragmentHeight = FragmentHeigth;
 this.ColumnsCount = ColumnsCount;
 this.LinesCount = LinesCount;
 this.TextColor = TextColor;
 this.BackgroundColor = BackgroundColor;
 }

 public int getLayoutType(){
 return LayoutType;
 }
 public void setLayoutType(int LayoutType){
 this.LayoutType = LayoutType;
 }
 public int getFragmentWidth(){
 return FragmentWidth;
 }
 public void setFragmentWidth(int FragmentWidth){
 this.FragmentWidth = FragmentWidth;
 }
 public int getFragmentHeight(){
 return FragmentHeight;
 }
 public void setFragmentHeight(int FragmentHeight){
 this.FragmentHeight = FragmentHeight;
 }
 public int getColumnsCount(){
 return ColumnsCount;
 }
 public void setColumnsCount(int ColumnsCount){
 this.ColumnsCount = ColumnsCount;
 }
 public int getLinesCount(){
 return LinesCount;
 }
 public void setLinesCount(int LinesCount){
 this.LinesCount = LinesCount;
 }
 public String getTextColor(){
 return TextColor;
 }
 public void setTextColor(String TextColor){
 this.TextColor = TextColor;
 }
 public String getBackgroundColor(){
 return BackgroundColor;
 }
public abstract class Main {public static void main(String[] args){
 Application Emulator = new Application("J2ME Loader", "1.8.2", "1920x1080");
 String nameApp = Emulator.getnameApp();
 String ApplicationVersion = Emulator.getVersion();
 String ApplicationResolution = Emulator.getResolution();

 Activity EmulatorActivity = new Activity(280, 520,"light_gray",80,"true");
 int ActivityWidth = EmulatorActivity.getActivityWidth();
 int ActivityHeight = EmulatorActivity.getActivityHeight();
 String Color = EmulatorActivity.getColor();
 int Transparency = EmulatorActivity.getTransparency();
 String Movable = EmulatorActivity.getMovable();

 Fragment EmulatorFragment = new Fragment(3,135,350,2,3,"black","orange");
 int LayoutType = EmulatorFragment.getLayoutType();
 int FragmentWidth = EmulatorFragment.getFragmentWidth();
 int FragmentHeight = EmulatorFragment.getFragmentHeight();
 int ColumnsCount = EmulatorFragment.getColumnsCount();
 int LinesCount = EmulatorFragment.getLinesCount();
 String TextColor = EmulatorFragment.getTextColor();
 String BackgroundColor = EmulatorFragment.getBackgroundColor();

 DialogFragment EmulatorSubFragment = new DialogFragment(7,120,290,4,2,"gray","red");

 Application.onStart(nameApp);
 Activity.onStart();
 Activity.onPause();
 Activity.onStop();
 Activity.onResume();
 Activity.onCreate();
 Fragment.onStart();
 Fragment.onAttach();
 Fragment.onPause();
 DialogFragment.onStart();
 DialogFragment.onAttach();
 DialogFragment.onPause();
 DialogFragment.onResume();
 DialogFragment.onDetach();
 DialogFragment.onCreateView();
 DialogFragment.onDestroy();
 Fragment.onResume();
 Fragment.onDetach();
 Fragment.onCreateView();
 Fragment.onDestroy();
 Activity.onDestroy();
 Application.onClose();
}}
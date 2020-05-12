<script>
export default {
  name: "BaseInputValue",
  props: ['value'],
  computed : {
    data: {
      get: function(){
        return this.value;
      },
      set: function(newValue){
        this.$emit('input', newValue)
      }
    }
  }
};
</script>